package com.hspedu.poly_.polyparameter_;

//经理
public class manager extends Employee {
    private double bouns;

    public manager(String name, double salary, double bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public void manage() {
        System.out.println("经理管理员工");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bouns;
    }
}
