package com.zk.nlqc.entitys.record;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.zk.nlqc.enums.QcResult;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "NLQC_QC_RECORD_BILLS")
@Entity(name = "nlqc_QcRecordBills")
public class QcRecordBills extends StandardEntity {
    private static final long serialVersionUID = -2788364256066130487L;

    @Column(name = "QC_RECORD_BILL_ITEM")
    protected String qcRecordBillItem;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME")
    protected Date createTime;

    @Column(name = "CAR_MODEL_NO")
    protected String carModelNo;

    @Column(name = "QC_WORK_STATION_NO")
    protected String qcWorkStationNo;

    @Column(name = "QC_WORK_STATION_NAME")
    protected String qcWorkStationName;

    @Column(name = "QC_ARGS_NO")
    protected String qcArgsNo;

    @Column(name = "QC_ARGS_TYPE")
    protected String qcArgsType;

    @Column(name = "QC_TYPE")
    protected String qcType;

    @Column(name = "QC_USER")
    protected String qcUser;

    @Column(name = "QC_RRESULT")
    protected String qcRresult;

    @Column(name = "NOTE")
    protected String note;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "qcRecordBills")
    protected List<QcRecordBillsItem> qcRecordItem;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setQcRresult(QcResult qcRresult) {
        this.qcRresult = qcRresult == null ? null : qcRresult.getId();
    }

    public QcResult getQcRresult() {
        return qcRresult == null ? null : QcResult.fromId(qcRresult);
    }

    public String getQcUser() {
        return qcUser;
    }

    public void setQcUser(String qcUser) {
        this.qcUser = qcUser;
    }

    public List<QcRecordBillsItem> getQcRecordItem() {
        return qcRecordItem;
    }

    public void setQcRecordItem(List<QcRecordBillsItem> qcRecordItem) {
        this.qcRecordItem = qcRecordItem;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getQcRecordBillItem() {
        return qcRecordBillItem;
    }

    public void setQcRecordBillItem(String qcRecordBillItem) {
        this.qcRecordBillItem = qcRecordBillItem;
    }

    public String getQcArgsType() {
        return qcArgsType;
    }

    public void setQcArgsType(String qcArgsType) {
        this.qcArgsType = qcArgsType;
    }

    public String getQcArgsNo() {
        return qcArgsNo;
    }

    public void setQcArgsNo(String qcArgsNo) {
        this.qcArgsNo = qcArgsNo;
    }

    public String getQcType() {
        return qcType;
    }

    public void setQcType(String qcType) {
        this.qcType = qcType;
    }

    public String getQcWorkStationName() {
        return qcWorkStationName;
    }

    public void setQcWorkStationName(String qcWorkStationName) {
        this.qcWorkStationName = qcWorkStationName;
    }

    public String getQcWorkStationNo() {
        return qcWorkStationNo;
    }

    public void setQcWorkStationNo(String qcWorkStationNo) {
        this.qcWorkStationNo = qcWorkStationNo;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }

}