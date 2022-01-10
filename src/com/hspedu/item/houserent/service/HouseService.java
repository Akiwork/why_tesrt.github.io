package com.hspedu.item.houserent.service;

import com.hspedu.item.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter =1;
    //数组的容量
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "JACK", 112, "海淀区", 2000, "未出租");
    }
    //返回 数组
    public House[] list() {
        return houses;
    }

    public House fixHome(int fixId){
        for (int i = 0; i < houseNums; i++) {
            if(fixId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            System.out.println("数组已满 不能再添加了");
            return false;
        }
        //后加 所以是在1的位置  =  新数组
        houses[houseNums++] = newHouse;
        //实时更新id的值
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int dcelId){
        int index = -1; //2 3   0 1 2  houses i = 1
        for (int i = 0; i < houseNums; i++) {
            if(dcelId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        // 1 2
        for (int i = index; i < houseNums-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }
}
