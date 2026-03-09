package edu.txstate.assignment2;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getClassName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "The area of this circle is: " + getArea();
    }
}