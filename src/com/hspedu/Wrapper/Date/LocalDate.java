package com.hspedu.Wrapper.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String str = dateTimeFormatter.format(ldt);
        System.out.println(str);
        //之后的时间
        System.out.println(dateTimeFormatter.format(ldt.plusDays(5)));
    }
}
