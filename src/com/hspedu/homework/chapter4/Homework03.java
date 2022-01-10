package com.hspedu.homework.chapter4;

public class Homework03 {
    public static void main(String[] args) {
        String name ="Willian Jefferson Clinton";
        print(name);
    }
    static void print(String name){

        String[] names =name.split(" ");
        if(names.length!=3){
            System.out.println("输入的String格式不正确");
        }
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
