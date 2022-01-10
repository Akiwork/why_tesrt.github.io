package com.hspedu.encap;

public class Account {
    public String name;
    private int Money;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<4 && name.length()>2){
            this.name = name;
        }else {
            this.name = "逆天";
            System.out.println("姓名格式不对,赋给默认值");
        }
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        if(money>=20){
            Money = money;
        }else {
            System.out.println("余额不足");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        }else {
            System.out.println("密码长度必须6位");
        }
    }
    public String info(){
        return "姓名"+ name + " "+"余额" + Money;
    }
}
