package com.company;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    //region Getter and setter
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    //endregion

    public boolean isValidTriangle() {
        if (this.sideA < this.sideB + this.sideC && this.sideB < this.sideA + this.sideC && this.sideC < this.sideA + this.sideB) {
            System.out.println("Triangle is valid");
            return true;
        } else {
            System.out.println("Triangle is not valid");
            return false;
        }
    }

    public void calculateTrianglePerimeter() {
        int perimeter = this.sideA + this.sideB + this.sideC;
        System.out.println(perimeter);
    }

    public void calculateTriangleArea() {
        double perimeter = this.sideA + this.sideB + this.sideC;
        double area = Math.sqrt(perimeter / 2 * ((perimeter / 2) - this.sideA) * ((perimeter / 2) - this.sideB) * ((perimeter / 2) - this.sideC));
        System.out.println(area);
    }
}
