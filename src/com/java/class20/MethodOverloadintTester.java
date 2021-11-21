package com.java.class20;

public class MethodOverloadintTester {
    public static void main(String[]args){
        MethodOverloading.add(10,10);
        MethodOverloading.addDouble(10.5,10.5);
        MethodOverloading.AddInt(10, 10,10);
        int [] arr={10,10};
        MethodOverloading.addArray(arr);

    }

}
