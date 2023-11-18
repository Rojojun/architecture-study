package com.rojojun.cleanarchitecture.common;

import javax.validation.Validator;

public abstract class SelfValidating<T> {
    private Validator validator;
}
