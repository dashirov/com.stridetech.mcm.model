package com.stridetech.mcm.model.logs;

import java.util.Date;

/**
 * Created by dashirov on 11/18/16.
 */
public class CampaignPriceChangelog {
    Double defaultValue = 0.0;

    public Double getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    private ChangeLog<Double> log = new ChangeLog<>();
    void addLogEntry( ChangeLogEntry<Double> entry){
        log.addLogEntry(entry);
    }

    Double getPrice(Date targetDate){
        return log.getValue(targetDate,defaultValue);
    }

}
