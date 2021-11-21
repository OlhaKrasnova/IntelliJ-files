package com.java.class19;

public class User {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobileNumber;

    User(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends User {
    String userAddress;

    UserInfo(String name, int mobileNumber) {
        super(name, mobileNumber);
    }

    void userDetails() {
        System.out.println("Name: " + name + ", Mobile number: " + mobileNumber + ", Address: " + userAddress);
    }
}
