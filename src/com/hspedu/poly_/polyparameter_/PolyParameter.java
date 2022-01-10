package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        OrdinaryStaff ordinaryStaff = new OrdinaryStaff("小明",5000);
        manager manager = new manager("辅导员",8000,2000);

        showEmpAnnal(ordinaryStaff);
        showEmpAnnal(manager);

        testwork(ordinaryStaff);
        testwork(manager);
    }
    public static void showEmpAnnal(Employee employee){
        System.out.println(employee.getAnnual());
    }
    public static void testwork(Employee employee){
        if(employee instanceof OrdinaryStaff){
            ((OrdinaryStaff) employee).work();
        }
        if(employee instanceof manager){
            ((manager) employee).manage();
        }
    }
}
