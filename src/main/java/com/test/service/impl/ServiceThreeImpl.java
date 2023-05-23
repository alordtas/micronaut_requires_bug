package com.test.service.impl;

import com.test.service.ServiceThree;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Singleton
@Requires(missingBeans = { ServiceThree.class })
public class ServiceThreeImpl implements ServiceThree {

    @Override
    public void doSomethingNoAnnotations() {
        System.out.println("Do something");
    }
}
