package cn.huawei.staycuteblog.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* @program: StayCuteBlog
*
* @description: 
*
* @author: huangmindong
*
* @create: 2019-07-06 18:41
**/
public class Time {

    public static String getTime(){
        Calendar now = Calendar.getInstance();
//        System.out.println("年：" + now.get(Calendar.YEAR));
//
//        System.out.println("月：" + (now.get(Calendar.MONTH) + 1));
//
//        System.out.println("日：" + now.get(Calendar.DAY_OF_MONTH));
//
//        System.out.println("时：" + now.get(Calendar.HOUR_OF_DAY));
//
//        System.out.println("分：" + now.get(Calendar.MINUTE));
//
//        System.out.println("秒：" + now.get(Calendar.SECOND));
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(d);
    }
}
