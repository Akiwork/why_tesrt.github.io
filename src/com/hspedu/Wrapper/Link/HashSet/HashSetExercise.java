package com.hspedu.Wrapper.Link.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee01("小王",10));
        hashSet.add(new Employee01("小刘",18));
        hashSet.add(new Employee01("小张",28));
        hashSet.add(new Employee01("小吴",38));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Employee01{
    private String name;
    private int age;

    public Employee01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 employee = (Employee01) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
