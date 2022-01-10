package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(a.equals(b));

        B b1 = new A();
        System.out.println(b.equals(b1));

        int n1 = 1;
        double d1 = 1.0;
        System.out.println(n1 == d1);


        "hello".equals("why");
    }
}

class A extends B {

}

class B {

}