package com.hspedu.homework.chapter2;

public class Homework7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.wind(5);
    }
}
class Car{
    private static double temperture;

    class Air{
        public void flow(double temperture){
            if(temperture>40){
                System.out.println("吹冷气");
            }else if(temperture<0){
                System.out.println("吹热气");
            }else {
                System.out.println("关闭");
            }
        }
    }

    public void wind(double temperture){
        Air air = new Air();
        air.flow(temperture);
    }
}