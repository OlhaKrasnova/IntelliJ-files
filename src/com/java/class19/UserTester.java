package com.java.class19;

public class UserTester {
    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("Olga", 123456789);
        userInfo.userAddress = "1000 Rockville pike, Rockville MD";
        userInfo.userDetails();
    }
}
