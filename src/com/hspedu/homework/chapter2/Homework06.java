package com.hspedu.homework.chapter2;


public class Homework06 {
    public static void main(String[] args) {
//        new Boat(new Vehicles() {
//            @Override
//            public void work() {
//                System.out.println("船");
//            }
//        });
//
//        new Horse1(new Vehicles() {
//            @Override
//            public void work() {
//                System.out.println("马");
//            }
//        });
//        String str="";
//        Person person = new Person("唐僧", (Vehicles) tools.getBoat());
//        Person person1 = new Person("唐僧", (Vehicles) tools.getHouse());
        Person person = new Person("唐僧", tools.getBoat());
        person.common();
        person.passRiver();
        person.passRiver();
        person.passRiver();
        person.common();

    }
}

interface Vehicles {
    void work();
}

class Horse1 implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况下用到马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河的时候用到船-----");
    }
    //    public Boat(Vehicles vehicles) {
//        vehicles.work();
//    }
}

class tools {
//    private static Boat boat;
//    private static Horse1 house1;

    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse1 getHouse() {
        return new Horse1();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
//        Boat boat = tools.getBoat();
//        boat.work();
        if (!(vehicles instanceof Boat)) {
            vehicles = tools.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof Horse1)) {
            vehicles = tools.getHouse();
        }
        vehicles.work();
    }
}

