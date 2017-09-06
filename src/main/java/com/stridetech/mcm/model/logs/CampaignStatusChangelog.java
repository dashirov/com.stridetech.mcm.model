package com.stridetech.mcm.model.logs;

import com.stridetech.mcm.model.enums.CampaignStatus;

import java.util.Date;
public class CampaignStatusChangelog {
    CampaignStatus defaultValue = CampaignStatus.PAUSED;

    public CampaignStatus getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(CampaignStatus defaultValue) {
        this.defaultValue = defaultValue;
    }

    private ChangeLog<CampaignStatus> log = new ChangeLog<>();
    void addLogEntry( ChangeLogEntry<CampaignStatus> entry){
        log.addLogEntry(entry);
    }

    CampaignStatus getPrice(Date targetDate){
        return log.getValue(targetDate,defaultValue);
    }

}
