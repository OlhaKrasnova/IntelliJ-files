package com.java.class22;

public class Person {
    String name;
    Person(String name){
        this.name=name;

    }
    void eat(){
        System.out.println("Person eating");
    }
    void performDailyTask(){
        System.out.println("Eat sleep repeat");
    }

   }
class Employee extends Person{
    Employee(String name){
        super(name);

    }
    public void performDailyTasks(){
        System.out.println("Working all day in office and reading emails at night");
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    public void performDailyTasks(){
        System.out.println("Attending the classes at day reading at night");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
    }
    public void performDailyTasks(){
        System.out.println("Teaching every day");
    }
    void designClasses(){
        System.out.println("Create repls and design new classes");
    }
}
