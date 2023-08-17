package com.kt.sfgpetclinicj8.model;

import java.io.Serializable;

/**
 * Created by kontelk on 8/17/23.
 */
public class BaseEntity implements Serializable {

    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
