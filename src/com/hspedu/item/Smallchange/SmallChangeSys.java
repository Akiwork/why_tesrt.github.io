package com.hspedu.item.Smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date = dateFormat.format(now);


        String details = "--------------零钱通明细--------------";

        double money = 0;
        double balance = 0;

        String note = "";

        do {
            System.out.println("--------------零钱通菜单--------------");
            System.out.println("\t" + "1 零钱通明细");
            System.out.println("\t" + "2 收费入账");
            System.out.println("\t" + "3 消   费");
            System.out.println("\t" + "4 退   出");
            System.out.println("请选择(1-4):");
            key = sc.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = sc.nextDouble();
                    balance += money;
                    details += "\n收益入账\t+" + money + "\t" + date + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = sc.nextDouble();
                    System.out.println("请输入消费说明");
                    note = sc.next();
                    balance -= money;
                    details += "\n" + note + "\t\t-" + money +"\t" +date + "\t" + balance;
                    break;
                case "4":
                    String choice ="";
                    while (true){
                        System.out.println("您确定要退出吗y/n");
                        choice = sc.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误 请重新选择");
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }
}
