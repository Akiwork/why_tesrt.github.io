package com.hspedu.poly_.polyarr_;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void teach(){
        System.out.println("老师教学生");
    }

    @Override
    public String say() {
        return super.say() + " 薪资是" + getSalary();
    }
}
