package edu.txstate.assignment2;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double getArea() {
        return (base * height) / 2;
    }

    
    public String getClassName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle (b=" + base + ", h=" + height + ")";
    }
}
