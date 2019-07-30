package com.zk.nlqc.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum QcResult implements EnumClass<String> {

    GO_BACK("GO_BACK"),
    ONE_PASS("ONE_PASS"),
    REFUSE("REFUSE"),
    FORCE_IN_CONE("FORCE_IN_CONE"),
    OK("OK"),
    NG("NG");

    private String id;

    QcResult(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static QcResult fromId(String id) {
        for (QcResult at : QcResult.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}