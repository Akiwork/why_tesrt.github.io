package com.hspedu.enum_;

public class EnumExercise02 {
    public static void main(String[] args) {
        for (week value : week.values()) {
            System.out.println(value);
        }
    }
}
@SuppressWarnings("")
enum week{
    OneDay("星期一"),
    Twoday("星期二"),
    ThreeDay("星期三"),
    FourDay("星期四"),
    FiveDay("星期五"),
    SixDay("星期六"),
    SevenDay("星期日");
    private String today;
    week(String today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "week{" +
                "today='" + today + '\'' +
                '}';
    }
}
