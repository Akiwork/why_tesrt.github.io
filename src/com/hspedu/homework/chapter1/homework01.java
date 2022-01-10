package com.hspedu.homework.chapter1;

public class homework01 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("小明", 11, "老师");
        people[1] = new Person("小明", 10, "老师");
        people[2] = new Person("小明", 28, "老师");
        people[3] = new Person("小明", 15, "老师");
        people[4] = null;
        int max;
        int temp;
        for (int i = 0; i < people.length-1; i++) {
            if(people[i].getAge() > people[i+1].getAge()){
                people[4] = people[i+1];
                people[i+1] = people[i];
                people[i] = people[4];
            }
        }
        for (int j = 0; j < people.length-1; j++) {
            System.out.println(people[j].getAge());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
