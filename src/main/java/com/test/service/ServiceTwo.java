package com.test.service;

import javax.validation.constraints.NotNull;

public interface ServiceTwo {

    @NotNull
    String notNullReturn(@NotNull final String input);
}
