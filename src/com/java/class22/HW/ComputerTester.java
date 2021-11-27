package com.java.class22.HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer comp1=new Computer("lenovo");
        Computer [] comps={new Apple("apple"), new Lenovo("lenovo"), new HP("hp"), new Dell("dell")};


        for (Computer comp2:comps
        ) {
            comp2.on();
            comp2.off();
            comp2.restart();

            if(comp2 instanceof Dell){
                ((Dell)comp2).accuracy();
            }


        }
    }
}


