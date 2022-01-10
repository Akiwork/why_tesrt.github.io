package com.hspedu.exception;

public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int num2 = 0;

        final char[] value = {'1','3','2'};
        value[0]  = '3';
        String name = "123";
        String name1 = new String("123");
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        System.out.println(name == name1.intern());
        System.out.println(name == "123");
        System.out.println("123".hashCode());
        double d= 100d;
        float f = 10;
        Float f1 = 10.0f;
        System.out.println(name.compareTo("123234"));
        System.out.println(f);
        int chos = Integer.parseInt(name);
        System.out.println(chos);
//        try {
//            int res = a / num2;
//        } catch (Exception e) {  内部
//            num2 = 10;
//            //e.printStackTrace();.
//            System.out.println(e.getMessage());
//        }
//        System.out.println("程序继续进行");


    }
}
