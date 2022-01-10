package com.hspedu.Wrapper.Link.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new employee("小苹果", 50000, 1));
        map.put(2, new employee("栗子", 15000, 2));
        map.put(3, new employee("西瓜", 18600, 3));
        Set set = map.entrySet();

        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            //把entry变成coll集合 因为coll集合中存放的是employee对象
            employee e = (employee) entry.getValue();
            if (e.getSal() > 18000) {
                System.out.println("Key ---" + entry.getKey() + "Value -------" + entry.getValue());
            }
        }
        System.out.println("=================================================");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            employee e = (employee) entry.getValue();
            if (e.getSal() > 18000) {
                System.out.println("Key ---" + entry.getKey() + "Value -------" + entry.getValue());
            }
        }
    }
}

class employee {
    private String name;
    private double sal;
    private int id;

    public employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
