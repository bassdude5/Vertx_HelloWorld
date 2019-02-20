package org.welte.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MyFirstVerticle extends AbstractVerticle {

	private final int portNum = 8081;
	
	@Override
	public void start(final Future<Void> fut) {
		
		vertx.createHttpServer().requestHandler(r -> {
			r.response().end("<h1>Hello from my first Vert.x 3 application</h1>");
		}).listen(portNum, result -> {
			if (result.succeeded()) {
				fut.complete();
			} else {
				fut.fail(result.cause());
			}
		});
	}
}
