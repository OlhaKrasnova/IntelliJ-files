package com.java.class20.HW;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;

    void calculateInterest(double balance, double interest) {
        System.out.println((balance / 100) * interest);

    }

    static class Visa extends CreditCard {

    }

    static class AX extends CreditCard {

        void calculateInterest(double balance, double interest) {
            System.out.println((balance * interest) / 200);

        }
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.calculateInterest(2000, 8);
        Visa visa = new Visa();
        visa.calculateInterest(15000, 25);
        AX ax = new AX();
        ax.calculateInterest(1000, 2.5);

    }
}


