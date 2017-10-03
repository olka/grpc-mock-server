import generated.DummyRequest;
import generated.ExpectedResultsRequest;
import generated.ExpectedResultsResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link ControllerServer}.
 */
public class ControllerClient {
    private static final Logger logger = Logger.getLogger(ControllerClient.class.getName());

    private final ManagedChannel channel;
    private final SpeechMockControllerGrpc.SpeechMockControllerBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public ControllerClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext(true)
                .build());
    }

    /** Construct client for accessing RouteGuide server using the existing channel. */
    ControllerClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = SpeechMockControllerGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /** Create expected results. */
    public void putExpectedResults(List<String> results) {
        logger.info("Will try to put expected results on server " + results + " ...");
        ExpectedResultsRequest request = ExpectedResultsRequest.newBuilder().addAllExpectedResult(results).build();
        ExpectedResultsResponse response;
        try {
            response = blockingStub.putExpectedResults(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Expected results: " + response.getMessage());
    }

    /** Get expected results list. */
    public void getExpectedResults() {
        logger.info("Will try to fetch exted results list ");
        DummyRequest request = DummyRequest.newBuilder().build();
        ExpectedResultsResponse response;
        try {
            response = blockingStub.getExpectedResults(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Expected results: " + response.getMessage());
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        ControllerClient client = new ControllerClient("192.168.1.2", 50051);
        try {
            List<String> results = Arrays.asList("1 1","2","3","4");
            logger.info("Initial get:");
            client.getExpectedResults();
            logger.info("Expected results set: "+results);
            client.putExpectedResults(results);
            logger.info("Post get:");
            client.getExpectedResults();
        } finally {
            client.shutdown();
        }
    }
}