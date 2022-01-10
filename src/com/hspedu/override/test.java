package com.hspedu.override;

public class test {


    public static void main(String[] args) {
        Student student = new Student("大牛逼", 18, 22, 85);
        System.out.println(student.say());

        Object object = new A();
        A a1 = (A) object;

        A a = new B();
        a.AA();
        System.out.println(a.a);

        B b = new B();
        b.GETB();
        b.GETB();
        b.GETB();

        A a2 = (A)b;

        A a3 = new A();

        System.out.println(object instanceof A);

        Student student1 = new Student("大牛逼", 18, 23, 85);
        student1 = null;
        System.gc();
    }
}

class A {
    int a = 10;
    static int b = 20;
    public static void A1(){
        System.out.println("A1111");
    }
    public void AA() {
        System.out.println("111");
    }

}

class B extends A {
    int a = 20;


    public void AA() {
        System.out.println("AA-222");
    }

    public void BB() {
        System.out.println("BB-222");
    }
    public void GETB(){
        b+=10;
        System.out.println(b);
    }
}
class C{

}
