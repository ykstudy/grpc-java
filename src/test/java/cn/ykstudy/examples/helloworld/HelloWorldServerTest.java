package cn.ykstudy.examples.helloworld;

import static org.junit.Assert.assertEquals;

import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit tests for {@link HelloWorldServer}.
 * For demonstrating how to write gRPC unit test only.
 * Not intended to provide a high code coverage or to test every major usecase.
 *
 * directExecutor() makes it easier to have deterministic tests.
 * However, if your implementation uses another thread and uses streaming it is better to use
 * the default executor, to avoid hitting bug #3084.
 *
 * <p>For more unit test examples see {@link io.grpc.examples.routeguide.RouteGuideClientTest} and
 * {@link io.grpc.examples.routeguide.RouteGuideServerTest}.
 */
//@RunWith(JUnit4.class)
public class HelloWorldServerTest {
  /**
   * This rule manages automatic graceful shutdown for the registered servers and channels at the
   * end of test.
   */
//  @Rule
//  public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

  /**
   * To test the server, make calls with a real stub using the in-process channel, and verify
   * behaviors or state changes from the client side.
   */
//  @Test
//  public void greeterImpl_replyMessage() throws Exception {
//    // Generate a unique in-process server name.
//    String serverName = InProcessServerBuilder.generateName();
//
//    // Create a server, add service, start, and register for automatic graceful shutdown.
//    grpcCleanup.register(InProcessServerBuilder
//        .forName(serverName).directExecutor().addService(new GreeterImpl()).build().start());
//
//    GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(
//        // Create a client channel and register for automatic graceful shutdown.
//        grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));
//
//
//    HelloReply reply =
//        blockingStub.sayHello(HelloRequest.newBuilder().setName( "test name").build());
//
//    assertEquals("Hello test name", reply.getMessage());
//  }
}
