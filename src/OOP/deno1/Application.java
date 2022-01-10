package OOP.deno1;

public class Application {
    public static void main(String[] args) {
        A a =new A();
        A a1 =new A(100);

        System.out.println(a);
        System.out.println(a1);
    }
}

class A{
    private int a;
    private static String color = "white";
    public A() {
        this.a = 10;
        this.color = "red";
    }

    public A(int a) {
        this.a = 20;
    }


    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", color='" + color + '\'' +
                '}';
    }
}
