package com.java.class18;

public class Task2 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    public static void main(String[] args) {

        F.printF();
    }
}

class J {
    static void printF() {
        System.out.println("printF from A");
    }
}

class F extends J {

}