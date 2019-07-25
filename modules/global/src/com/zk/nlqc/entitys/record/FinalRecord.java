package com.zk.nlqc.entitys.record;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|flowNo")
@Table(name = "NLQC_FINAL_RECORD")
@Entity(name = "nlqc_FinalRecord")
public class FinalRecord extends StandardEntity {
    private static final long serialVersionUID = 4570231568564271320L;

    @Column(name = "FLOW_NO")
    protected String flowNo;

    @Column(name = "CAR_MODEL_NO")
    protected String carModelNo;

    @Column(name = "CAR_MODEL_NAME")
    protected String carModelName;

    @Column(name = "FINAL_RESULT")
    protected String finalResult;

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }
}