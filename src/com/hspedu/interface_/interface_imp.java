package com.hspedu.interface_;

public class interface_imp {

    public static void main(String[] args) {

        interface03[] interface031 = new interface03[2];
        interface031[0] = new Phone();
        interface031[0].work();

        interface03 interface03 = new Phone();
        interface03.work();

        //
        Camera camera = new Camera() {
            @Override
            public void work(interface03 interface032) {
                System.out.println("摄像机工作");
            }
        };

        new Camera().work(new interface03() {
            @Override
            public void work() {
                System.out.println("摄像机工作2");
            }
        });

        interface03.work();

        f1(new interface03() {
            @Override
            public void work() {
                System.out.println("开始工作");
            }
        });
        f1(new interface03() {
            @Override
            public void work() {
                System.out.println("开始工作2");
            }
        });

        Camera camera1 = new Camera();
        f1(camera1);

        interface03 interface032 = (interface03)camera1;
        System.out.println("come here");
        interface03.work();
        System.out.println("come here");
        outer outer= new outer();
        outer.t1();

        outer.inner inner1 = new outer.inner();
        inner1.innerf();

        outer.inner inner2 = outer.getinner();
        inner2.innerf();
        System.out.println(camera.x);
        System.out.println(interface03.x);


    }

    public static void f1(interface03 interface03) {
        interface03.work();
    }


}
class outer {
    static int a = 10;
    static int b = 10;
    public static class inner {
        static int b = 10;
        public void innerf() {
            int y = 10;
            System.out.println(a);
        }
        private void innerf1() {
            int y = 10;
            System.out.println(a);
        }
    }

    public void t1(){
        inner inner = new inner();
        inner.innerf();
        inner.innerf1();
    }
    public inner getinner(){
        return new inner();
    }
}
