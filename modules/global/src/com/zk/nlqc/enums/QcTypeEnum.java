package com.zk.nlqc.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum QcTypeEnum implements EnumClass<String> {

    IPQC("IPQC"),
    FQC("FQC");

    private String id;

    QcTypeEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static QcTypeEnum fromId(String id) {
        for (QcTypeEnum at : QcTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}