package com.hspedu.Wrapper.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("当前时间"+d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前时间"+format);
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
    }
}
