package com.stridetech.mcm.model.meta;

import com.stridetech.mcm.model.enums.MarketplaceStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(exclude={"id"})
public class Marketplace {
    @Nullable
    private Long id;
    @NotNull
    private String name;
    @Nullable
    private String description;
    @NotNull
    private MarketplaceStatus status;
    @NotNull
    private Date statusUpdated;
    @Nullable
    private String contactEmail;
    @Nullable
    private String contactName;

    public Marketplace() {
    }

    @Nullable
    public Long getId() {
        return id;
    }

    @NotNull
    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    public MarketplaceStatus getStatus() {
        return status;
    }

    @NotNull
    public void setStatus(MarketplaceStatus status) {
        this.status = status;
    }

    @Nullable
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

    @Nullable
    public void setContactName(String name) { this.contactName = name; }
    public String getContactName() { return contactName; }

    @Nullable
    public void setContactEmail(String email) { this.contactEmail = email; }
    public String getContactEmail() { return contactEmail; }


}
