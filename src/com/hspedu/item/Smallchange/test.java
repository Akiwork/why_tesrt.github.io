package com.hspedu.item.Smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date = dateFormat.format(now);

        //创建Person数组
        Person[] person = new Person[3];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(0,date,0);
        }
        //person[0] = new Person(100,date,"收益入账");
        Scanner sc = new Scanner(System.in);
        do {
            int j = 0;

            System.out.println("--------------零钱通菜单--------------");
            System.out.println("\t" + "1 零钱通明细");
            System.out.println("\t" + "2 收费入账");
            System.out.println("\t" + "3 消   费");
            System.out.println("\t" + "4 退   出");
            System.out.println("请选择(1-4):");
            switch (sc.nextInt()){
                case 1:
                    person[j].printall(person);
                    break;
                case 2:
                    person[0].cost(100);
                    person[1].cost(500);
                    person[2].cost(-20);
                    System.out.println(person[0].print());
                    System.out.println(person[1].print());
                    System.out.println(person[2].print());

                    break;
            }
            j++;
        } while ((sc.nextInt() != 4));

    }
}
