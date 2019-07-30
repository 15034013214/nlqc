package com.zk.nlqc.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DeviceType implements EnumClass<String> {

    WEIGH("WEIGH"),
    HEIGHT("HEIGHT"),
    ELSE("ELSE");

    private String id;

    DeviceType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DeviceType fromId(String id) {
        for (DeviceType at : DeviceType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}