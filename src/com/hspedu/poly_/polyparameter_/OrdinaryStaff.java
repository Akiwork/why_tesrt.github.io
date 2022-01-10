package com.hspedu.poly_.polyparameter_;
//普通员工
public class OrdinaryStaff extends Employee{

    public OrdinaryStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work(){
        System.out.println("员工在工作");
    }
}
