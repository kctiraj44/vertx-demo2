package com.danielprinz.udemy.vertex_starter.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleN extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("*-----Start---* : "+ getClass().getName()+ " On thread:"+Thread.currentThread().getName());
    System.out.println("with config"+config().toString());
       startPromise.complete();
}
}
