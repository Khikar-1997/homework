package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printRectanglePerimeter(rectangle.calculateRectanglePerimeter());
        rectangle.printRectangleArea(rectangle.calculateRectangleArea());
    }
}
