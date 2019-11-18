package com.company;

public class Main {
    public static void main(String args[]) {
        Triangle triangle = new Triangle(4, 8, 11);
        if (triangle.isValidTriangle()) {
            triangle.calculateTrianglePerimeter();
            triangle.calculateTriangleArea();
        }
    }
}
