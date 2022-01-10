package com.hspedu.extends03;

public class PC extends Computer{
    private String brand;
    public PC(String CPU,String memory,String Harddisk,String brand){
        super(CPU,memory,Harddisk);
        this.brand = brand;
        System.out.print("品牌"+brand+ " ");
    }
}
