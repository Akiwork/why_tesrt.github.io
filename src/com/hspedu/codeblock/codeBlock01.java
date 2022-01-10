package com.hspedu.codeblock;

public class codeBlock01 {
    public static void main(String[] args) {
        Movie.num1 = 10;
        System.out.println(Movie.getNum1());
    }
}
class Movie{
    {
        System.out.println("芜湖hhhhhhh");
    }
    static {
        System.out.println("11");
    }
    private String name;
    private double price;
    private String director;
    private static int num = getNum1();
    public static int num1;

    public static int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

}
