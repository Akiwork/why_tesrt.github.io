package com.hspedu.extends03;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("AMD","16G","SN500","联想");
        PC pc1 = new PC("AMD","16G","SN500","联想");
        System.out.println(pc.hashCode());
        System.out.println(pc1.hashCode());
        System.out.println(pc.getDetails());
    }
}
