package com.hspedu.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {
        new Throws01().f2();
    }
    void f1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    void f2(){
        try {
            f1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
