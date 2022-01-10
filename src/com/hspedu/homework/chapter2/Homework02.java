package com.hspedu.homework.chapter2;

public class Homework02 {
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());

        System.out.println(new Frock() {
        }.getSerialNumber());
        System.out.println(new Frock() {
        }.getSerialNumber());
        System.out.println(new Frock() {
        }.getSerialNumber());

    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum(){
        return currentNum+=100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
