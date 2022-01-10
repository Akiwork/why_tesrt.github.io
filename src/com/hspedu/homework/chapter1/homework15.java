package com.hspedu.homework.chapter1;

public class homework15 {
    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        System.out.println("obj的运作类型" + b1.getClass());
        System.out.println("obj的运作类型" + obj.getClass());
        //父类指向子类 向上转型
        obj = new CCC();
        System.out.println("obj的运作类型" + obj.getClass());
    }
}
class AAA{

}
class BBB extends AAA{

}
class CCC extends BBB{

}