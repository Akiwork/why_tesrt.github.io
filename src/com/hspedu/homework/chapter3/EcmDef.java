package com.hspedu.homework.chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line =Integer.parseInt(sc.next());
        try {
            System.out.println(chu(line, line));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("不可以除0");
        }catch (InputMismatchException e){
            throw new InputMismatchException("类型异常");
        }catch (NumberFormatException e){
            throw new NumberFormatException("数据格式异常");
        }
    }
    static int chu(int n1,int n2){
        return n1/n2;
    }
}

