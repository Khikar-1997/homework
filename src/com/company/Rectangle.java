package com.company;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    //region Getter and Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    //endregion

    public int calculateRectanglePerimeter() {
        int perimeter = 2 * (this.height + this.width);
        return perimeter;
    }

    public int calculateRectangleArea() {
        int area = this.height * this.width;
        return area;
    }

    public void printRectanglePerimeter(int perimeter) {
        System.out.println("Rectangle perimeter = " + perimeter);
    }

    public void printRectangleArea(int area) {
        System.out.println("Rectangle area = " + area);
    }
}
