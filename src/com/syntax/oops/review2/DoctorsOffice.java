package com.syntax.oops.review2;


    public class DoctorsOffice {
        public static void main(String[] args) {
            Doctor doctor1=new Doctor("John", "Doe", "ENT");
            System.out.println(doctor1.name);
            System.out.println(doctor1.lastName);
            System.out.println(doctor1.speciality);
            System.out.println(doctor1.salary);
            //System.out.println(doctor1.ssn); //ssn=private

            doctor1.printInfo();
            doctor1.treatPatient("Hasim");
            doctor1.work();
            //doctor1.getPaid();

            // Doctor doctor2=new Doctor("JAne", "Smith", "Dentist", 200000);
            //Constructor Doctor(String, String,String, double) is private



        }

    }

