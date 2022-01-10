package com.hspedu.modifier;

public class B {
    public static void say(){
        A a = new A();
        System.out.println(a.m1());
    }

    public static void main(String[] args) {
        say();
    }
}
