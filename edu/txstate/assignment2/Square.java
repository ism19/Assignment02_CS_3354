package edu.txstate.assignment2;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String getClassName() {
        return "Square";
    }

    @Override
    public String toString() {
        // Match the GUI example: "Square (s=3.4)"
        return "Square (s=" + side + ")";
    }
}
