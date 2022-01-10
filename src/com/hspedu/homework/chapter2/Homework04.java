package com.hspedu.homework.chapter2;

public class Homework04 {
    public static void main(String[] args) {
        new Cellphone(){

        }.testWork(new PC() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
    }
}

interface PC {
    double work(double n1, double n2);
}

class Cellphone {
    void testWork(PC pc, double n1, double n2) {
        double res = pc.work(n1, n2);
        System.out.println(res);
    }
}
