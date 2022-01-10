package com.hspedu.homework.chapter1;

public class test {
    public static void main(String[] args) {
        SavingsAccount savingsAccount =new SavingsAccount(1000);
        savingsAccount.deposit(1000);
        savingsAccount.deposit(1000);
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(1000);
        savingsAccount.earnMonthluinterest();
        System.out.println(savingsAccount.getBalance());

    }
}
