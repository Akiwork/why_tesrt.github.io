package com.hspedu.Wrapper.Link.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        Integer[] arr = {1, -1, 23, 45, 2, 5};
        Integer[] newArr1 = arr;
        Integer[] newArr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("newARR " + Arrays.toString(newArr));
//        sort(arr);
//        System.out.println(Arrays.toString(arr));

        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubble02(Integer arr[], Comparator c) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
