package cn.ykstudy.routeguide.service;

import java.util.Collection;

import cn.ykstudy.examples.routeguide.Feature;
import cn.ykstudy.examples.routeguide.Point;
import cn.ykstudy.examples.routeguide.Rectangle;
import cn.ykstudy.examples.routeguide.RouteGuideGrpc;
import cn.ykstudy.examples.routeguide.RouteNote;
import cn.ykstudy.examples.routeguide.RouteSummary;
import io.grpc.stub.StreamObserver;

public class RouteGuideService extends RouteGuideGrpc.RouteGuideImplBase {
	private Collection<Feature> features;
	@Override
	public void getFeature(Point request, StreamObserver<Feature> responseObserver) {
		responseObserver.onNext(checkFeature(request));
		responseObserver.onCompleted();
	}

	@Override
	public void listFeatures(Rectangle request, StreamObserver<Feature> responseObserver) {
		// TODO Auto-generated method stub
		super.listFeatures(request, responseObserver);
	}

	@Override
	public StreamObserver<Point> recordRoute(StreamObserver<RouteSummary> responseObserver) {
		// TODO Auto-generated method stub
		return super.recordRoute(responseObserver);
	}

	@Override
	public StreamObserver<RouteNote> routeChat(StreamObserver<RouteNote> responseObserver) {
		// TODO Auto-generated method stub
		return super.routeChat(responseObserver);
	}

	private Feature checkFeature(Point location) {
		for (Feature feature : features) {
			if (feature.getLocation().getLatitude() == location.getLatitude()
					&& feature.getLocation().getLongitude() == location.getLongitude()) {
				return feature;
			}
		}

		// No feature was found, return an unnamed feature.
		return Feature.newBuilder().setName("").setLocation(location).build();
	}

}
