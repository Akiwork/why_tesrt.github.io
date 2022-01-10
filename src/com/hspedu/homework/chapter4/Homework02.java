package com.hspedu.homework.chapter4;

public class Homework02 {
    public static void main(String[] args) {
        String name = "why";
        String password = "123456";
        String email = "123@.";
        for (String s : (login(name, password, email))) {
            System.out.println(""+s);
        }
    }

    public static String[] login(String name, String password, String email) {
        int uerlegth = name.length();
        if (!(uerlegth >= 2 && uerlegth <= 4 )) {
            throw new RuntimeException("信息不对");
        }
        if (!(password.length() == 6)) {
            throw new RuntimeException("信息不对2");
        }
        int idex =email.indexOf("@");
        int _dex =email.indexOf(".");
        if (!(idex>0 && _dex>idex)) {
            throw new RuntimeException("信息不对3");
        }
        return new String[]{name, password, email};
    }
}
