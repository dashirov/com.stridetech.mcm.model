package com.stridetech.mcm.model.meta;

import com.stridetech.mcm.model.enums.CampaignStatus;
import com.stridetech.mcm.model.enums.CampaignType;

import java.util.Date;

import lombok.EqualsAndHashCode;

/**
 * Created by dashirov on 11/17/16.
 */
@EqualsAndHashCode
public class Campaign {
    private String product;
    private String tracker;
    private Long marketplace;
    private CampaignType type;
    private CampaignStatus status;
    private Date statusUpdated;
    private String name;
    private  String description;
    private Long costCents;
    private Long businessUnit;
    // TODO: add campaign targetEffectiveCPA , targetEffectiveCPAUpdated and corresponding changelog / retrospect

    public Campaign() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStatusUpdated() {
        return statusUpdated;
    }

    public void setStatusUpdated(Date statusUpdated) {
        this.statusUpdated = statusUpdated;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String productCode) {
        this.product = productCode;
    }

    public String getTracker() {
        return tracker;
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public Long getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Long marketplaceId) {
        this.marketplace = marketplaceId;
    }

    public CampaignType getType() {
        return type;
    }

    public void setType(CampaignType type) {
        this.type = type;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public void setStatus(CampaignStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Long costCents) {
        this.costCents = costCents;
    }

    public Long getCost() {
        return this.costCents;
    }

    public Long getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(Long businessUnit) {
        this.businessUnit = businessUnit;
    }
}
