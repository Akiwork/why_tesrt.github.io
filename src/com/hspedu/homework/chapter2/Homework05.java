package com.hspedu.homework.chapter2;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "23333";

    public void f1() {
        //局部内部类
        class B {
            private String name = "6666";

            void show() {
                System.out.println("A的名字" + A.this.name + "B的名字" + name);
            }
        }
        B b = new B();
        b.show();
    }

}
