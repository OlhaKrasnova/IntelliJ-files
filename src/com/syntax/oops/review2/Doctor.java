package com.syntax.oops.review2;

public class Doctor {

        //instance variables
        public String name;
        public String lastName;
        public String speciality;
        double salary;
        private long ssn;

        //static variable
        public static String hospital;

        //constructor
        private Doctor(String name, String lastName, String speciality, double salary){
            this.name=name;
            this.lastName=lastName;
            this.speciality=speciality;
            this.salary=salary;
        }

        //constructor
        public Doctor(String name, String lastName, String speciality){
            this.name=name;
            this.lastName=lastName;
            this.speciality=speciality;
        }

        protected void treatPatient(String name) {
            System.out.println("Doctor "+this.name+" treats patient "+name);
        }

        public void printInfo() {
            System.out.println(name +" "+lastName+ " is a "+speciality);
        }

        //instance methods can work with instance and static
        void work() {
            System.out.println(name +" works at hospital "+hospital);
        }

        private void getPaid() {
            System.out.println(name+" gets paid "+salary);
        }

        //static can work only with static
        static void companyName() {
            System.out.println("All doctors work at "+hospital);
        }

    }



