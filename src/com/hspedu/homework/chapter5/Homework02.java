package com.hspedu.homework.chapter5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("宝马",400000);
        Car car1 = new Car("宾利",500000);
        @SuppressWarnings("all")
        List list = new ArrayList();
        list.add(car);
        list.remove(car);
        list.add(car);
        List list2 = list;
        list.contains(car);
        list.size();
        list.add(1);
        list.add(2);
        list.isEmpty();
        list.clear();
        list.addAll(list2);
        list.containsAll(list2);
        list2.add(car1);
        //list.removeAll(list2);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
            Car car2 = (Car)next;
            System.out.println(car2);
        }
        
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

