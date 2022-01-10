package com.hspedu.Wrapper.Link.Map;

import java.util.*;

public class TreeMap_ {
    public static void main(String[] args) {
        Map map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        map.put("11233","javk");
        map.put("323","tom");
        map.put("21","c");
        map.put("123","why");

        System.out.println(map);
    }
}
