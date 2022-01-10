package com.hspedu.homework.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        m.put("jack", 2600);
        Set set = m.entrySet();
        for (Object o : set) {
            Map.Entry map = (Map.Entry) o;
            m.put(map.getKey(),(int)map.getValue()+100);
            //System.out.println("name:  "+map.getKey()+"   sal :"+((int) map.getValue() + 100));
            System.out.println(m);
        }

    }
}

