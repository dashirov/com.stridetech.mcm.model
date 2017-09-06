package com.stridetech.mcm.model.logs;

import com.stridetech.mcm.model.meta.UploadLog;

import java.util.Comparator;

public class UploadLogComparator implements Comparator<UploadLog>{
    @Override
    public int compare(UploadLog o1, UploadLog o2) {
        return o2.getUploadDate().compareTo(o1.getUploadDate());
    }
}

