package com.hspedu.override;

public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "学号" + id + " " + "成绩" + score;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + id);
    }
}
