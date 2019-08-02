package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.zk.nlqc.entitys.base.QcArgs;

import java.util.List;

/**
 * 该类用于封装参数  封装QcArgs列表。
 */
public class QcParam  implements ScreenOptions {

    private  String qcItemNo;
    private List<QcArgs> qcArgs;

    /**
     * 参数的封装类
     * @param qcItemNo 创建页面分配的编号
     * @param qcArgs 检测参数列表
     */
    public QcParam(String qcItemNo ,  List<QcArgs> qcArgs) {
        this.qcItemNo = qcItemNo;
        this.qcArgs = qcArgs;
    }

    public List<QcArgs> getQcArgs() {
        return qcArgs;
    }

    public String getQcItemNo(){
        return this.qcItemNo;
    }
}
