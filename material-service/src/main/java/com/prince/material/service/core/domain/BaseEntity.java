package com.prince.material.service.core.domain;

import java.util.UUID;

public abstract class BaseEntity {

    private static final Long serialVersionUID = 1L;

    protected String id = UUID.randomUUID().toString();

    protected  BaseEntity(){}
}
