package com.hspedu.exception;

public class CustomException {
    public static void main(String[] args) {
        System.out.println(new Person(200));
    }
}
class Person{
    private int age;

    public Person(int age) {
        if(age <18 || age>120){
            throw new THROWS("不符合");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
class THROWS extends RuntimeException{
    public THROWS(String message) {
        super(message);
    }
}
