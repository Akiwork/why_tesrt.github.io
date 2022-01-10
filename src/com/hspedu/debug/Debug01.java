package com.hspedu.debug;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
        //演示 逐行执行
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += i;
            System.out.println(res);
        }

        int[] arr = {-1,1,10,20,-10};
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
    }
}
