package com.hspedu.Wrapper.Link.LinkedList01;

import java.util.HashSet;

public class Linklist {
    public static void main(String[] args) {
        Node node1 = new Node("小红");
        Node node2 = new Node("小黄");
        Node node3 = new Node("小蓝");

        node1.next = node2;
        node2.next = node3;
        node3.pre = node2;
        node2.pre = node1;

        Node first = node1;
        Node last = node3;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("============================================");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        Node node4 = new Node("怪胎");
        node4.pre = node2;
        node4.next = node3;
        node3.pre = node4;
        node2.next = node4;
        System.out.println("============================================");
        first = node1;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("pgh");
        hashSet.add("java1");

    }
}

class Node {
    private String name;
    public Node next;
    public Node pre;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
