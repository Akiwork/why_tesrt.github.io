package com.hspedu.Wrapper.Link.HashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
//        Set set = new LinkedHashSet();
//        set.add(new Car("奥迪",500000));
//        set.add(new Car("法拉利",5000000));
//        set.add(new Car("奥迪",500000));

        Map map = new HashMap();
        map.put(1,new Car("奥迪",500000));
        map.put(2,new Car("法拉利",5000000));
        map.put(3,new Car("奥迪",500000));
        //得到entryset
        Set set1 = map.entrySet();
        //循环得到entry
        for (Object o :set1) {
            //class java.util.HashMap$Node == entry
            System.out.println(o.getClass());
            Map.Entry entry = (Map.Entry)o;

            System.out.println("K" + entry.getKey() + "Value" + entry.getValue());
        }


//        for (Object o :set) {
//            System.out.println(o);
//        }

    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
