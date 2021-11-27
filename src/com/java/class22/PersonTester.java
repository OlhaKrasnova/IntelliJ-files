package com.java.class22;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Teacher("Asghar");
        person.eat();
        Person person1=new Student("Mykl");
        Person [] persons={new Student("Farhad"), new Employee("Naiya"), new Teacher("Asel")};

        for(Person person2:persons){
            person2.performDailyTask();

            if(person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }

        }

    }
}
