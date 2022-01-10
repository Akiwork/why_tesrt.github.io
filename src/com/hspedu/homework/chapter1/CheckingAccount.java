package com.hspedu.homework.chapter1;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount -1);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount -1);
    }

}
