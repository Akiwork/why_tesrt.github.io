package com.hspedu.modifier;

public class A {

    //四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public static void main(String[] args) {
        System.out.println(new A().toString());
    }

    public String m1() {
        return "A{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                ", n4=" + n4 +
                '}';
    }

    @Override
    public String toString() {
        return "A{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                ", n4=" + n4 +
                '}';
    }
}
