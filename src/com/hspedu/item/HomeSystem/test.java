package com.hspedu.item.HomeSystem;

public class test{
    public static void main(String[] args){
        MainSystem mainSystem = new MainSystem();

        MainSystem[] mainSystems = new MainSystem[5];
        //public MainSystem(int id, String name, int phone, String address, double monthMoney, String state) {
        for (int i = 0; i < mainSystem.getId(); i++) {
            //把实例化的对象都传入这个数组
            mainSystems[i] = new MainSystem(mainSystem.getId(),mainSystem.getName(),
                    mainSystem.getPhone(),mainSystem.getAddress(),
                    mainSystem.getMonthMoney(),mainSystem.getState());
        }

        mainSystem.home();

        //System.out.println(mainSystem.toString());
    }
}
