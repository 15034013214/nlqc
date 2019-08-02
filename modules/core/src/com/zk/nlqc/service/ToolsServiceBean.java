package com.zk.nlqc.service;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Query;
import com.haulmont.cuba.core.Transaction;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service(ToolsService.NAME)
public class ToolsServiceBean implements ToolsService {

    public static DateFormat dateFormat;
    @Inject
    private Persistence persistence;

    @Override
    public String getNumberByClassAndDate(String className, String tableName ,String dateFormatText, int offset , boolean isByDay) {
        if(!StringUtils.isEmpty(className.trim()) && !StringUtils.isEmpty(tableName.trim())&& !StringUtils.isEmpty(dateFormatText.trim())){
            if(null != className && "" != className && offset > 0){
                dateFormat = new SimpleDateFormat(dateFormatText);
                String upperLetter = getStringUpperLetter(className);
                String dateStr = getDateTimeByFormat(new Date() , dateFormat);
                String formatStr = "%0"+offset+"d";
                String number = String.format(formatStr ,  getEntityCount(tableName , isByDay));
                return upperLetter+dateStr+number;
            }
        }
        return null;
    }

    @Override
    public String getDateTimeByFormat(Date date, DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    @Override
    public void test() {
//        System.out.println(getFormatNumber(999 , "%05d"));
//        System.out.println(getEntityCount("NLQC_CAR_MODEL"));
//        System.out.println(getNumberByClassAndDate("CarModel", "NLQC_CAR_MODEL" , "yymm",3 , false));
    }

    /**
     * 获取一个字符串的所有大写字母
     * @parm str 需要转换的字符串
     * @return 大写字符形成的字符串
     */
    private String getStringUpperLetter(String str){
        StringBuffer stringBuffer = new StringBuffer();
        if(null == str || str.length() ==0){
            return "";
        }
        char[] chars = str.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            char upChar = chars[index];
            if(upChar >= 65 && upChar <= 90){
                stringBuffer.append(upChar);
            }
        }
        String returnStr = stringBuffer.toString();
        if(returnStr.length() == 0){
            return str.substring(0,1).toUpperCase();
        }else {
            return returnStr;
        }
    }

    /**
     * 获取某个类当天创建的个数
     * @param tableName 表名
     * @param isByDay 是否按照天计算数量 true：按照今天的生产数量。 false：统计所有的数量。
     */
    private int getEntityCount(String tableName  , boolean isByDay){
        String sql;
        if(isByDay){
            sql = "select count(*) from "+ tableName + " e where year(e.CREATE_TS)=year(now()) and month(e.CREATE_TS)=month(now()) and day(e.CREATE_TS)=day(now())";
        }else {
            sql = "select count(*) from "+ tableName + " e";
        }
        Object obj;
        try (Transaction tx = persistence.createTransaction()) {
            EntityManager entityManager = persistence.getEntityManager();
            Query query = entityManager.createNativeQuery(sql);
            obj = query.getSingleResult();
        }
        return new Integer(obj.toString()) + 1;
    }
}