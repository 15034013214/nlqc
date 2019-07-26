package com.zk.nlqc.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum FrequencyUnitEnum implements EnumClass<String> {

    PIECE("PIECE"),
    MINUTE("MINUTE"),
    HOUR("HOUR"),
    DAY("DAY"),
    MONTH("MONTH");

    private String id;

    FrequencyUnitEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static FrequencyUnitEnum fromId(String id) {
        for (FrequencyUnitEnum at : FrequencyUnitEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}