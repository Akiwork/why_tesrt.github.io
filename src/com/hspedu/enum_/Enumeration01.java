package com.hspedu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
enum Season {
    //public final static Season SPRING = new Season("春天", "温暖");
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷");
    private String name;
    private String desc;
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
//class Season {
//    private String name;
//    private String desc;
//
//    public final static Season SPRING = new Season("春天", "温暖");
//
//    private Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//    public String getName() {
//        return name;
//    }
//
//
//    public String getDesc() {
//        return desc;
//    }
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}