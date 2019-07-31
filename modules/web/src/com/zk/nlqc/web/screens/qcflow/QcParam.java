package com.zk.nlqc.web.screens.qcflow;

import com.haulmont.cuba.gui.screen.ScreenOptions;
import com.zk.nlqc.entitys.base.QcArgs;
import com.zk.nlqc.entitys.complex.QcItem;

import java.util.List;

/**
 * 该类用于封装参数  封装QcArgs列表。
 */
public class QcParam  implements ScreenOptions {

    private List<QcArgs> qcArgs;

    public QcParam(List<QcArgs> qcArgs) {
        this.qcArgs = qcArgs;
    }

    public List<QcArgs> getQcArgs() {
        return qcArgs;
    }
}
