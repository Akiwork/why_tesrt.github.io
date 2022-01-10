package com.hspedu.item.HomeSystem;

import java.util.Scanner;

public class MainSystem {
    int id = 0;
    private String name;
    private int phone;
    private String address;
    private double MonthMoney;
    private String state;
    private String str = "";
    private String Allstr = "";
    private MainSystem[] mainSystem = new MainSystem[5];
    private boolean bool = true;
    Scanner sc = new Scanner(System.in);

    public void home() {
        do {
            System.out.println("----------------------房屋出租系统----------------------");
            System.out.println("\t\t" + "1 新 增 房 源");
            System.out.println("\t\t" + "2 查 找 房 源");
            System.out.println("\t\t" + "3 删 除 房 源");
            System.out.println("\t\t" + "4 修 改 房 屋 信 息");
            System.out.println("\t\t" + "5 房 屋 列 表");
            System.out.println("\t\t" + "6 退      出");
            switch (sc.next()) {
                case "1":
                    Addhome();
                    break;
                case "2":
                    Search();
                    break;
                case "3":
                    remove();
                    break;
                case "4":
                    chagehome();
                    break;
                case "5":
                    showall();
                    break;
                case "6":
                    bool = false;
                    break;
            }
        } while (bool);
    }

    public void Addhome() {
        System.out.println("----------------------添加房屋----------------------");
        System.out.print("姓名：");
        setName(sc.next());
        System.out.print("电话：");
        setPhone(sc.nextInt());
        System.out.print("地址：");
        setAddress(sc.next());
        System.out.print("月租：");
        setMonthMoney(sc.nextDouble());
        System.out.print("状态(未出租/已出租)：");
        setState(sc.next());
        System.out.println("----------------------添加完成----------------------");
        print();
        dataArray();
        id++;
    }

    public void Search() {
        System.out.print("请选择(1-6)");
        System.out.println("----------------------查找房屋----------------------");
        System.out.println("----------------------请输入你要查找的id----------------------");
        int n1 = sc.nextInt();
        // 1 1 == 1 .1
        for (int i = 0; i < id; i++) {
            if(n1 == mainSystem[i].getId()){
                System.out.println(mainSystem[i].toString());
            }
        }
    }

    public void remove() {
        System.out.println("----------------------删除房屋----------------------");
        System.out.println("请选择待删房屋编号(-1退出):");
        int n1 = sc.nextInt();
        if (!(n1 == -1)) {
            System.out.println("确认是否删除(1/0): 请小心选择");
            System.out.println("请输入你的选择(1/0)");
            if (sc.nextInt() == 1) {
                //删除
                mainSystem[n1-1] = null;
                System.out.println(mainSystem[n1-1]);
                System.out.println("删除成功");
            }
        } else {
            return;
        }
    }

    public void chagehome() {
        System.out.println("----------------------修改客户----------------------");
        System.out.print("请选择修改房屋编号：");
        int n1 = sc.nextInt();
        System.out.print("姓名：" + "(" + name + ")");
        mainSystem[n1 - 1].setName(sc.next());
        System.out.print("电话：" + "(" + phone + ")");
        mainSystem[n1 - 1].setPhone(sc.nextInt());
        System.out.print("地址：" + "(" + address + ")");
        mainSystem[n1 - 1].setAddress(sc.next());
        System.out.print("月租：" + "(" + address + ")");
        mainSystem[n1 - 1].setMonthMoney(sc.nextDouble());
        System.out.print("状态(未出租/已出租)：" + "(" + address + ")");
        mainSystem[n1 - 1].setState(sc.next());
        System.out.println("----------------------修改完成----------------------");
        System.out.println(mainSystem[n1 - 1].toString());
    }

    public void showall() {
        System.out.println("----------------------房屋列表----------------------");
        //System.out.println(Allstr);
        for (int i = 0; i < mainSystem.length; i++) {
            if(mainSystem[i] !=null){
                System.out.println(mainSystem[i].toString());
            }
        }
        System.out.println("----------------------房屋列表完成----------------------");
    }

    public void print() {
        str = "ID = " + id + " ,姓名='" + name + '\'' +
                ", 手机号=" + phone +
                ", 地址='" + address + '\'' +
                ", 月租=" + MonthMoney +
                ", 状态='" + state + '\'' +
                '}' + "\n";
        Allstr +=str;
        System.out.println(str);

    }


    public void dataArray() {
        mainSystem[id] = new MainSystem(id+1, getName(), getPhone(),
                    getAddress(), getMonthMoney(), getState());
    }

    public MainSystem() {

    }

    public MainSystem(int id, String name, int phone, String address, double monthMoney, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        MonthMoney = monthMoney;
        this.state = state;
    }

    public MainSystem[] getMainSystem() {
        return mainSystem;
    }

    public void setMainSystem(MainSystem[] mainSystem) {
        this.mainSystem = mainSystem;
    }

    @Override
    public String toString() {
        return "MainSystem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", MonthMoney=" + MonthMoney +
                ", state='" + state + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthMoney() {
        return MonthMoney;
    }

    public void setMonthMoney(double monthMoney) {
        MonthMoney = monthMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
