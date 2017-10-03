import generated.DummyRequest;
import generated.ExpectedResultsRequest;
import generated.ExpectedResultsResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ControllerServer {
    private static final Logger logger = Logger.getLogger(ControllerServer.class.getName());
    private static List<String> expectedResults = new ArrayList<>();

    private Server server;

    private void start() throws IOException {
    /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new SpeechMockControllerImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ControllerServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final ControllerServer server = new ControllerServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class SpeechMockControllerImpl extends SpeechMockControllerGrpc.SpeechMockControllerImplBase {


        @Override
        public void putExpectedResults(ExpectedResultsRequest req, StreamObserver<ExpectedResultsResponse> responseObserver) {
            StringBuffer replyBuffer = new StringBuffer();
            for(String r : req.getExpectedResultList()){
                System.out.println(r);
                replyBuffer.append(r);
            }
            expectedResults.addAll(req.getExpectedResultList());
            ExpectedResultsResponse reply = ExpectedResultsResponse.newBuilder().setMessage("Expected results " + expectedResults).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

        @Override
        public void getExpectedResults(DummyRequest req, StreamObserver<ExpectedResultsResponse> responseObserver) {
            ExpectedResultsResponse reply = ExpectedResultsResponse.newBuilder().setMessage("Expected results " + expectedResults).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}