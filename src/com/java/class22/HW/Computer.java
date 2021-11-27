package com.java.class22.HW;

import java.sql.SQLOutput;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String name;
   Computer(String name) {
       this.name = name;
   }
    void on(){
        System.out.println(name+ "computer turns on");
    }
    void restart() {
        System.out.println("Computer restarting");
    }
    void off(){
        System.out.println("Computer turns off");
    }
}
class Apple extends Computer{
    Apple(String name){
        super(name);
    }
    void restart(){
        System.out.println(name+ " computer restarts with a restart button");
    }
}
class Lenovo extends Computer{
    Lenovo(String name){
        super(name);
    }
    void restart(){
        System.out.println(name+ " computer restarts by going to menu -> restart");
    }

    }
class HP extends Computer {
    HP(String name) {
        super(name);
    }

    void off() {
        System.out.println(name + " computer turns off by pulling the plug");
    }
}
class Dell extends Computer {
    Dell(String name) {
        super(name);
    }

    void restart() {
        System.out.println(name + " computer restarts by itself");
    }
    void accuracy(){
        System.out.println((name + " Computer performs calculations with 100% accuracy."));
    }
}


