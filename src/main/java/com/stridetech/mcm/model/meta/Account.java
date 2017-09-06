package com.stridetech.mcm.model.meta;

import com.stridetech.mcm.model.enums.AccountStatus;
import com.stridetech.mcm.model.enums.AccountType;

import java.util.Date;
import java.util.SortedSet;

import lombok.EqualsAndHashCode;

/**
 * Created by dashirov on 11/17/16.
 */
@EqualsAndHashCode(exclude={"id"})
public class Account {
    private Long id;
    private AccountType type;
    private String name;
    private String description;
    private AccountStatus status;
    private Date statusUpdated;


    private SortedSet<String> products;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public SortedSet<String> getProducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setProducts(SortedSet<String> products) {
        this.products = products;
    }

    public Date getStatusUpdated() {
        return statusUpdated;
    }

    public void setStatusUpdated(Date statusUpdated) {
        this.statusUpdated = statusUpdated;
    }
}
