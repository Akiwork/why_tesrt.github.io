package com.hspedu.extends03;

public class Computer {
    private String CPU;
    private String Memory;
    private String Harddisk;

    public Computer(String CPU, String memory, String harddisk) {
        this.CPU = CPU;
        Memory = memory;
        Harddisk = harddisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHarddisk() {
        return Harddisk;
    }

    public void setHarddisk(String harddisk) {
        Harddisk = harddisk;
    }

    public String getDetails() {
        return "CPU" + CPU + " " + "内存" + Memory + " " + "硬盘" + Harddisk;
    }
}

