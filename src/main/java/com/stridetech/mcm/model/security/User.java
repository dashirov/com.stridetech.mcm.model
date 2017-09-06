package com.stridetech.mcm.model.security;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

import java.util.List;


@EqualsAndHashCode(exclude={"id"})
public class User {

    @NotNull
    private String email;

    @NotNull
    private Boolean enabled;


    private List<Authority> authorities;
    private List<Feed> feeds;


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }
}
