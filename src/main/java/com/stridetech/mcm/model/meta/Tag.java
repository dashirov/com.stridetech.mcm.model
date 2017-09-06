package com.stridetech.mcm.model.meta;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude={"id"})
public class Tag {
    private Long id;
    private Long group;
    private String value;

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
