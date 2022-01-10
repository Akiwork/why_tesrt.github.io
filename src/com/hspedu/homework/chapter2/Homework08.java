package com.hspedu.homework.chapter2;

import com.hspedu.item.houserent.utils.Utility;

public class Homework08 {
    public static void main(String[] args) {
        switch (Color.valueOf(Utility.readString(8))) {
            case BLACK:
                System.out.println("黑色");
                System.out.println(Color.BLACK);
                break;
            case RED:
                System.out.println("红色");
                System.out.println(Color.RED);
                break;
            case YELLOW:
                System.out.println("黄色");
                System.out.println(Color.YELLOW);
                break;
            case GREEN:
                System.out.println("绿色");
                System.out.println(Color.GREEN);
                break;
            case BLUE:
                System.out.println("蓝色");
                System.out.println(Color.BLUE);
                break;

        }
    }
}

enum Color implements Color_imp {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }

    @Override
    public void show() {

    }
}

interface Color_imp {
    void show();
}