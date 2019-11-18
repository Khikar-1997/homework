package com.company;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculateCirclePerimeter(){
        double perimeter = 2 * this.radius * Math.PI;
        System.out.println("Circle perimeter = " + perimeter);
    }

    public void calculateCircleArea(){
        double area = Math.PI * Math.pow(this.radius,2);
        System.out.println("Circle area = " + area);
    }
}
