package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description TODO
 * @Date 2020/10/1 16:53
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        Date[] thisMonthStartAndEndTime = getThisMonthStartAndEndTime(date);
        for (Date d:thisMonthStartAndEndTime) {
            System.out.println(d);
        }
    }

    /**
     * 获取当前月份的开始时间和结束时间,作为查询区间
     */
    public static Date[] getThisMonthStartAndEndTime(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Date[] startAndEndDate = new Date[2];//定义数组用于存放起始时间[0]和结束时间[1]
        //获取当月前的月的起始时间和结束时间
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1, 0, 0, 0);//设置当月的起始时间
        startAndEndDate[0] = calendar.getTime();//存放到数组中
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(
                Calendar.DAY_OF_MONTH));//设置当月结束天为当月的最大天，如：9月份最大天为30，此时设置天为30
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE), 23, 59, 59);//设置当月的结束时间
        startAndEndDate[1] = calendar.getTime();//存放到数组中
        return startAndEndDate;
    }
}
