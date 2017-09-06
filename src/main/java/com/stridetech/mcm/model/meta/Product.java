package com.stridetech.mcm.model.meta;

import com.stridetech.mcm.model.enums.ProductStatus;

import java.util.Date;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Product {
    private String id;
    private String name;
    private String description;

    private ProductStatus status;
    private Date statusUpdated;

    /**
     * NO-ARG CONSTRUCTOR ONLY
     **/
    public Product() {
    }

    public Date getStatusUpdated() {
        return statusUpdated;
    }

    public void setStatusUpdated(Date statusUpdated) {
        this.statusUpdated = statusUpdated;
    }

    /**
     * GETTERS AND SETTERS
     **/


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
