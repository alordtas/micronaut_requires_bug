package com.test.service.impl;

import com.test.service.ServiceOne;

import io.micronaut.context.annotation.Requires;
import io.micronaut.scheduling.annotation.Async;
import jakarta.inject.Singleton;

@Singleton
@Requires(missingBeans = { ServiceOne.class })
public class ServiceOneImpl implements ServiceOne {

    @Override
    @Async
    public void asyncMethod() {
        System.out.println("Execute async using @Async");
    }
}
