package OOP.deno1;

public class Student extends Person{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age, String name1) {
        super(name);
        this.age = age;
        this.name = name1;
    }

    public void study(){
        System.out.println(this.name+"在学习");
    }
}
