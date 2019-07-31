package com.zk.nlqc.service;

import java.text.DateFormat;
import java.util.Date;

public interface ToolsService {
    String NAME = "nlqc_ToolsService";

    /**
     * 根据类名和创建日期生产编号，规则如下：
     *      类名大写字母+yymmddhhMMss+offset位数字顺序号
     * @param className 需要给哪个类创建编号
     * @param tableName Entity对应的表名称
     * @param dateFormatText 日期格式例如：yymmddhhMMss。如果需要短一点可以适当的减少长度。例如：yymm
     * @param offset    编号长度（默认为5），例如长度为5的1号为：00001
     * @param isByDay   是否按照当天的新建数量计算编号。true：按照当天的新建数量。false:按照所有的数量。
     * @return 类名大写字母+yymmdd+offset位数字顺序号
     * 例如：getNumberByClassAndDate("CarModel", "NLQC_CAR_MODEL" , "yymm" ,3 , false)
     */
    String getNumberByClassAndDate(String className, String tableName ,String dateFormatText , int offset , boolean isByDay);

    /**
     * 根据获取某一天的的指定格式的字符串形式
     * @param date  日期
     * @param dateFormat    日期格式
     * @return  日期的字符串形式
     */
    String getDateTimeByFormat(Date date , DateFormat dateFormat);

    /**
     * 用于测试别的方法
     */
    void test();
}