package com.hspedu.exception;

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        INT_NUM.find1();
    }
}

class INT_NUM {
    static void find1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String str = sc.next();
            try {
                int num = Integer.parseInt(str);
                System.out.println("您的输入为： "+num);
                break;
            } catch (Exception e) {
                System.out.println("输入有误 请重新输入");
                System.out.println("掏出异常为" + e.getMessage());
            }
        }
    }
}
