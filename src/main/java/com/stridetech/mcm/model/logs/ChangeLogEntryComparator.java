package com.stridetech.mcm.model.logs;

/**
 * Created by dashirov on 11/18/16.
 */
import java.util.Comparator;

public class ChangeLogEntryComparator implements Comparator<ChangeLogEntry> {
    @Override
    public int compare(ChangeLogEntry o1, ChangeLogEntry o2) {
        return o2.effectiveDate.compareTo(o1.effectiveDate);
    }

}