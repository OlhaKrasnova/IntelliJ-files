package com.java.class21;

public class Parent {
    void method(int n){
        System.out.println(n);
    }
}
class Child extends Parent{
    @Override
    void method(int n) {
        System.out.println(n);
    }
}
class Tester{
    public static void main(String[] args){

    }
}
