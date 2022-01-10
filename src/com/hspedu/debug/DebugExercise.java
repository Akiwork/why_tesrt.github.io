package com.hspedu.debug;

//debug对象创建的过程 加深对调试的理解
public class DebugExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack);

    }
}
class Person{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
