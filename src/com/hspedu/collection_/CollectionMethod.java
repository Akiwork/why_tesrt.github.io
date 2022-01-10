package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add(10);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
//        iterator = list.iterator();
//        iterator.next();
        for (Object obj : list) {
            System.out.println(obj);
        }
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//
//        }

//        for (Object o :) {
//
//        }

    }
}
