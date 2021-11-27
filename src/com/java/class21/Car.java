package com.java.class21;

public class Car {
    void ignite(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use brakes to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }
}
class BMW extends Car{
    void ignite(){
        System.out.println("use the button to start me");
    }
}
class Tesla extends Car{
    @Override
    void ignite() {
        System.out.println("use mobile app to start me");
    }
    void park(){
        System.out.println("use parking sensors to park me");
    }
}
class Toyota extends Car{

}

