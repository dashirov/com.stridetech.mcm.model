package com.stridetech.mcm.model.meta;

import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Created by VS on 5/31/2017.
 */
@EqualsAndHashCode(exclude={"id"})
public class UploadLog {
    private Long uploadtypeID;
    private String email;
    private Date uploadDate;
    private String originalFilename;
    private String uploadStatus;
    private String parserStatus;
    private String parserMessage;
    private String filename;

    public UploadLog() {
    }


    public Long getUploadtypeID() {
        return uploadtypeID;
    }

    public void setUploadtypeID(Long uploadtypeID) {
        this.uploadtypeID = uploadtypeID;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }



    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getParserStatus() {
        return parserStatus;
    }

    public void setParserStatus(String parserStatus) {
        this.parserStatus = parserStatus;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getParserMessage() {
        return parserMessage;
    }

    public void setParserMessage(String parserMessage) {
        this.parserMessage = parserMessage;
    }
}
