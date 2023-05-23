package com.test.controller;

import org.reactivestreams.Publisher;

import com.test.service.ServiceOne;
import com.test.service.ServiceThree;
import com.test.service.ServiceTwo;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

@Controller
public class TestController {

    private final ServiceOne serviceOne;
    private ServiceTwo serviceTwo;
    private ServiceThree serviceThree;

    // Fails to inject ServiceOne
    TestController(final ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    // Fails to inject ServiceTwo
//    TestController(final ServiceTwo serviceTwo) {
//        this.serviceTwo = serviceTwo;
//    }

    // Succeeds injecting ServiceThree
//    TestController(final ServiceThree serviceThree) {
//        this.serviceThree = serviceThree;
//    }

    @Get("{+path}")
    @Consumes(MediaType.ALL)
    Publisher<HttpResponse<?>> doGet(@NonNull final String path) {
        return Mono.just(HttpResponse.ok());
    }
}
