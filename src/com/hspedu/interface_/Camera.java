package com.hspedu.interface_;

public class Camera implements interface03{
    @Override
    public void work() {
        System.out.println("override void");
    }

    public void work(interface03 interface03){
        interface03.work();
    }
    public void kit(){
        System.out.println(x);
        System.out.println("pritae");
    }
}
