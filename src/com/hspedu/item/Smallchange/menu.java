package com.hspedu.item.Smallchange;

public class menu {
    private int money;
    private String date;
    private int source;

    public menu(int money, String date, int source) {
        this.money = money;
        this.date = date;
        this.source = source;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int cost(int cost){
        source = source+ cost;
        return source;
    }

    public String print() {
        return "收益入账 " + source + "\t" + date + "\t" + "余额:" + (money+source);
    }
    public void printall(Person person[]) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].print());
        }
    }
}
