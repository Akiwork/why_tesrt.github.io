package com.hspedu.item.Smallchange;

import java.util.Scanner;

public class newOOPmenu {
    private boolean loop = true;
    private double money = 0;
    private double blance = 0;
    private String details = "--------------零钱通明细--------------";


    Scanner sc =new Scanner(System.in);

    public void caidan(){
        do {
            System.out.println("--------------零钱通菜单--------------");
            System.out.println("\t" + "1 零钱通明细");
            System.out.println("\t" + "2 收费入账");
            System.out.println("\t" + "3 消   费");
            System.out.println("\t" + "4 退   出");
            System.out.println("请选择(1-4):");
        }while (loop);
    }
    public void Scoure(){
        System.out.println(details);
    }
}
