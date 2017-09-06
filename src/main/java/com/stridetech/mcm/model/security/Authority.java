package com.stridetech.mcm.model.security;

import org.jetbrains.annotations.NotNull;

/**
 * Created by VS on 6/5/2017.
 */
public class Authority {


    private Long id;

    @NotNull
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Authority(String name){
        this.name = name;
    }

}