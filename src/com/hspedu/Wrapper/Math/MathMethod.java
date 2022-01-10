package com.hspedu.Wrapper.Math;

public class MathMethod {
    public static void main(String[] args) {
        //random返回的是0<= X <1
        //返回一个数 x   2<= x <=7
        //Math.random*(b-a) 返回的就是 0<=数<=b-a
        //(int)(a) <= x <= (int)(a+Math.random*(b-a+1))

        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2+Math.random()*6));
        }
    }
}
