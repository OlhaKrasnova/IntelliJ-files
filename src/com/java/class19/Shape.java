package com.java.class19;

public class Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
       In circle class create a method to calculate the area of circle. Test your code
     */
    double radius;

    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {
    double PI = 3.14;

    Circle(double radius) {
        super(radius);
    }

    void calculateArea() {

        double area = super.radius * super.radius * PI;
        System.out.println(" area of a circle with radius " + radius + " is " + area);
    }
}
