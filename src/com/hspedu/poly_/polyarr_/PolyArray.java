package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        //Person p = new Student("小明",18,85);
        Person[] persons = new Person[5];
        persons[0] = new Person("小胡",10);
        persons[1] = new Student("小明", 18, 85);
        persons[2] = new Teacher("韩雪飞", 35, 10000);
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }
            if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }
        }
    }
}
