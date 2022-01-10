package com.hspedu.homework.chapter4;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str, 1, 4));


    }

    public static String reverse(String str, int start, int end) {
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] ch = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
}
