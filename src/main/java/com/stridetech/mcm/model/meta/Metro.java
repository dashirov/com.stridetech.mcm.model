package com.stridetech.mcm.model.meta;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude={"id"})
public class Metro {
    private Long id;
    private String name;
    private String description;
    private Boolean isExtended;

    public Metro() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getExtended() {
        return isExtended;
    }

    public void setExtended(Boolean extended) {
        isExtended = extended;
    }
}
