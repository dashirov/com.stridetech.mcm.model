package com.stridetech.mcm.model.logs;

import com.stridetech.mcm.model.enums.ProductStatus;

import java.util.Date;

/**
 * Created by dashirov on 11/18/16.
 */
public class ProductStatusChangelog {
    ProductStatus defaultValue = ProductStatus.PAUSED;

    public ProductStatus getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(ProductStatus defaultValue) {
        this.defaultValue = defaultValue;
    }

    private ChangeLog<ProductStatus> log = new ChangeLog<>();
    void addLogEntry( ChangeLogEntry<ProductStatus> entry){
        log.addLogEntry(entry);
    }

    ProductStatus getPrice(Date targetDate){
        return log.getValue(targetDate,defaultValue);
    }

}
