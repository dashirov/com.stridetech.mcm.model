package com.stridetech.mcm.model.stats;

import java.time.LocalDateTime;
import java.util.SortedSet;

public class AcquisitionGuidance {
    private Integer id;
    private String productCode;
    private String trackingCode;
    private LocalDateTime cohort;
    private LocalDateTime revised_at;
    private Double ltvEstimate;

    /** NO-ARG CONSTRUCTOR ONLY  **/

    public AcquisitionGuidance() {

    }

    /** GETTERS AND SETTERS **/

    public void setCampaignCode( String campaignCode ){
        String[] out = campaignCode.split("^",2);
        if (out[0].length()<=6 && out[1].length()<=6){
            this.setProductCode(out[0].toUpperCase());
            this.setTrackingCode(out[1].toLowerCase());
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public LocalDateTime getCohort() {
        return cohort;
    }

    public void setCohort(LocalDateTime cohort) {
        this.cohort = cohort;
    }

    public LocalDateTime getRevised_at() {
        return revised_at;
    }

    public void setRevised_at(LocalDateTime revised_at) {
        this.revised_at = revised_at;
    }

    public Double getLtvEstimate() {
        return ltvEstimate;
    }

    public void setLtvEstimate(Double ltvEstimate) {
        this.ltvEstimate = ltvEstimate;
    }
}
