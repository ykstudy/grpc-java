package cn.ykstudy.helloworld.service;

import cn.ykstudy.examples.helloworld.GreeterGrpc;
import cn.ykstudy.examples.helloworld.HelloReply;
import cn.ykstudy.examples.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
	
	@Override
	public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
		HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void sayHelloAgain(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
		HelloReply reply = HelloReply.newBuilder().setMessage("Hello again " + req.getName()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
}
