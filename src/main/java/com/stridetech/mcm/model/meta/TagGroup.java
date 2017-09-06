package com.stridetech.mcm.model.meta;

import lombok.EqualsAndHashCode;
import com.stridetech.mcm.model.enums.TagType;

import java.util.SortedSet;
import java.util.TreeSet;

@EqualsAndHashCode(exclude={"id"})
public class TagGroup {
    private Long id;
    private Boolean isMutex;
    private SortedSet<TagType> applicableTo;

    public TagGroup() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMutex() {
        return isMutex;
    }

    public void setMutex(Boolean mutex) {
        isMutex = mutex;
    }

    public SortedSet<TagType> getApplicableTo() {
        return applicableTo;
    }

    public void setApplicableTo(SortedSet<TagType> applicableTo) {
        this.applicableTo = applicableTo;
    }

    public void addApplicableTo(TagType applicableTo) {
        if (this.applicableTo == null)
            this.applicableTo = new TreeSet<>();

        this.applicableTo.add(applicableTo);
    }

}
