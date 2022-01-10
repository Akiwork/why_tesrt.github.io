package com.hspedu.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        //枚举的名字
        System.out.println(Season2.WINTER.name());
        //枚举的次序
        System.out.println(Season2.WINTER.ordinal());
        //包含了定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 value : values) {
            System.out.println(value);
        }
        //valueof：将字符串转换成枚举对象 要求字符串必须为已有的常量名
        System.out.println(Season2.valueOf("SPRING"));
    }
}

enum Season2 {
    //public final static Season SPRING = new Season("春天", "温暖");
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷");
    private String name;
    private String desc;

    private Season2(String name, String desc) {
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
