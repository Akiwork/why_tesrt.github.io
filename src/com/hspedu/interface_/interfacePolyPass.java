package com.hspedu.interface_;

public class interfacePolyPass {
    public static void main(String[] args) {
        IG ig =new Teacher();
        IH ih =new Teacher();
        Teacher teacher=new Teacher();
        IG ig1 = (IG)teacher;
        ig1.h1();
    }
}
interface IH{
    void h1();
}
interface IG extends IH{

}
class Teacher implements IG{
    @Override
    public void h1() {
        System.out.println("重写方法");
    }

}
