package com.test.service.impl;

import javax.validation.constraints.NotNull;

import com.test.service.ServiceTwo;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;

@Singleton
@Requires(missingBeans = { ServiceTwo.class })
public class ServiceTwoImpl implements ServiceTwo {

    @Override
    public @NotNull String notNullReturn(@NotNull final String input) {
        return null;
    }
}
