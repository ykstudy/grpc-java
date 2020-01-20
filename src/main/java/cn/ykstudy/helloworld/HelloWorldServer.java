/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ykstudy.helloworld;

import java.io.IOException;
import java.util.logging.Logger;

import cn.ykstudy.examples.helloworld.GreeterGrpc;
import cn.ykstudy.examples.helloworld.HelloReply;
import cn.ykstudy.examples.helloworld.HelloRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
@GrpcService
public class HelloWorldServer extends GreeterGrpc.GreeterImplBase {
	private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

	@Override
	public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
		HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + req.getName()).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
}
