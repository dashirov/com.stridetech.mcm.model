package com.stridetech.mcm.model.security;

import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

/**
 * Created by VS on 5/31/2017.
 */
@EqualsAndHashCode(exclude={"id"})
public class Feed {

    private Long id;

    @NotNull
    private String name;

    private String bucket;
    private String prefix;
    private String rejectPrefix;
    private String archivePrefix;
    private String filePrefix;


    public Feed() {
    }

public Feed(String name) {
    this.name = name;
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

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


    public String getRejectPrefix() {
        return rejectPrefix;
    }

    public void setRejectPrefix(String rejectPrefix) {
        this.rejectPrefix = rejectPrefix;
    }

    public String getArchivePrefix() {
        return archivePrefix;
    }

    public void setArchivePrefix(String archivePrefix) {
        this.archivePrefix = archivePrefix;
    }

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }
}
