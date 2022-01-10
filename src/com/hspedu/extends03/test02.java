package com.hspedu.extends03;

public class test02 {
    public static void main(String[] args) {
        B b =new B();

        b.a1();
        A a = (A) b;
        System.out.println(a.getClass());
        if(a instanceof B){
            System.out.println("true");
        }
        a.a1();

        C c =new C();
        c.a1();
        B b1 =(B)c;
        System.out.println(b1.getClass());
        if(b1 instanceof C){
            System.out.println("true");
        }
        
    }
}
interface A{
    void a1();
}
class B implements A{
    @Override
    public void a1() {
        System.out.println("B");
    }
}
class C extends B{

}