package com.hspedu.object_;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 18, '1');
        Person p2 = new Person("小明", 18, '1');

        System.out.println(p1.equals(p2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;


    @Override
    public boolean equals(Object obj) {
        //判断是不是同一个对象 p1.equals(p1)
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name == p.name && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
