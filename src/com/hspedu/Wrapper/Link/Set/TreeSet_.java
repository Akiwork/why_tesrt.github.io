package com.hspedu.Wrapper.Link.Set;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        Set set  =new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        set.add("bACK");
        set.add("tom");
        set.add("sp");
        set.add("a");

        System.out.println(set);
    }
}
