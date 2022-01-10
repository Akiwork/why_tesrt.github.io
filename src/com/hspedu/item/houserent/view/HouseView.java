package com.hspedu.item.houserent.view;

import com.hspedu.item.houserent.domain.House;
import com.hspedu.item.houserent.service.HouseService;
import com.hspedu.item.houserent.utils.Utility;

/*
 * 显示界面 接受用户输入
 * */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(4);


    public void findHouse(){
        System.out.println("----------------------查找房屋----------------------");
        System.out.println("----------------------请输入你要查找的id----------------------");
        int findId=Utility.readInt();
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else {
            System.out.println("----------------------查找房屋id不存在----------------------");
        }
    }

    public void chage(){
        System.out.println("----------------------修改房屋----------------------");
        System.out.print("请选择修改房屋编号：");
        int fixId = Utility.readInt();
        House house = houseService.fixHome(fixId);
        System.out.print("姓名：" + "(" + house.getName() + ")");
        house.setName(Utility.readString(8));
        System.out.print("电话：" + "(" + house.getPhone() + ")");
        house.setPhone(Utility.readInt(12));
        System.out.print("地址：" + "(" + house.getAddress() + ")");
        house.setAddress(Utility.readString(16));
        System.out.print("月租：" + "(" + house.getRent() + ")");
        house.setRent(Utility.readInt());
        System.out.print("状态(未出租/已出租)：" + "(" + house.getState() + ")");
        house.setState(Utility.readString(3));
        System.out.println(house);
        System.out.println("----------------------修改完成----------------------");
    }

    public void delHouse(){
        System.out.println("----------------------删除房屋----------------------");
        System.out.println("----------------------请输入待删除的房屋编号（-1退出）----------------------");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("----------------------放弃删除房屋信息----------------------");
        }
        char choice =  Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("----------------------删除房屋信息成功----------------------");
            }else {
                System.out.println("----------------------房屋编号不存在 删除失败----------------------");
            }
        }else {
            System.out.println("----------------------放弃删除房屋信息----------------------");
        }
    }

    public void listHouses(){
        System.out.println("----------------------房屋列表----------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] != null){
                System.out.println(houses[i]);
            }
        }
        System.out.println("----------------------房屋列表完成----------------------");
    }

    public void addHouse(){
        System.out.println("----------------------添加房屋----------------------");
        System.out.println("----------------------添加房屋----------------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        int phone = Utility.readInt(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String state = Utility.readString(3);

        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("----------------------添加成功----------------------");
        }else {
            System.out.println("----------------------添加失败----------------------");
        }
        System.out.println("----------------------添加完成----------------------");
    }
    public void mainMenu() {
        do {
            System.out.println("----------------------房屋出租系统----------------------");
            System.out.println("\t\t" + "1 新 增 房 源");
            System.out.println("\t\t" + "2 查 找 房 源");
            System.out.println("\t\t" + "3 删 除 房 源");
            System.out.println("\t\t" + "4 修 改 房 屋 信 息");
            System.out.println("\t\t" + "5 房 屋 列 表");
            System.out.println("\t\t" + "6 退      出");
            System.out.print("请选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    chage();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    loop = false;
                    break;
                default:
                    break;


            }
        } while (loop);
    }
}
