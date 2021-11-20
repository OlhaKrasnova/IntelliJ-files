package com.java.class19;

public class Employee {
    String name;
    int age;
    int baseSalary = 30000;
    int baseNoDaysOff = 20;

    void printSalary() {
        System.out.println(baseSalary);
    }

    void printNoDaysOff() {
        System.out.println(baseNoDaysOff);
    }
}

class Manager extends Employee{
    int bonus=10;
    int travellingAllowance=200;
    void printSalary(){
       super.printSalary();
       System.out.println(bonus+travellingAllowance);

    }
}
