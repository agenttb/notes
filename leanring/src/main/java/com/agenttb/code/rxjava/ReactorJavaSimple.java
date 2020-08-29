package com.agenttb.code.rxjava;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class ReactorJavaSimple {
    public static void main(String[] args) {
        Flux.fromArray(new String[] {"a", "b", "c"})
                .subscribe(System.out::println);

        Mono.fromFuture(CompletableFuture.completedFuture("Hello world"))
                .subscribe(System.out::println);
    }
}
