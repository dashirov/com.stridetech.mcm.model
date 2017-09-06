package com.stridetech.mcm.model.logs;

import com.stridetech.mcm.model.enums.MarketplaceStatus;

import java.util.Date;

public class MarketplaceStatusChangelog {
    MarketplaceStatus defaultValue = MarketplaceStatus.PAUSED;

    public MarketplaceStatus getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(MarketplaceStatus defaultValue) {
        this.defaultValue = defaultValue;
    }

    private ChangeLog<MarketplaceStatus> log = new ChangeLog<>();
    void addLogEntry( ChangeLogEntry<MarketplaceStatus> entry){
        log.addLogEntry(entry);
    }

    MarketplaceStatus getPrice(Date targetDate){
        return log.getValue(targetDate,defaultValue);
    }

}
