package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("我是大牛逼");
        a.setMoney(50);
        a.setPassword("123456");
        System.out.println(a.info());
    }
}
