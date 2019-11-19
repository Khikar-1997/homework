package com.company;

public class Point {
    private double cordinateX;
    private double cordinateY;

    public Point(double cordinateX, double cordinateY) {
        this.cordinateX = cordinateX;
        this.cordinateY = cordinateY;
    }

    public Point() {
    }

    //region Getter and setter
    public double getCordinateX() {
        return cordinateX;
    }

    public void setCordinateX(double cordinateX) {
        this.cordinateX = cordinateX;
    }

    public double getCordinateY() {
        return cordinateY;
    }

    public void setCordinateY(double cordinateY) {
        this.cordinateY = cordinateY;
    }
    //endregion

    public void cordinantsDistance() {
        double distance = Math.sqrt(Math.pow(this.cordinateX, 2) + Math.pow(this.cordinateY, 2));
        System.out.println(distance);
    }

    public void cordinantPointOneDistanceFromPointTwo(double cordinateX1, double cordinateY1) {

        double distance = Math.sqrt(Math.pow((this.cordinateX - cordinateX1), 2) + Math.pow((this.cordinateY - cordinateY1), 2));
        System.out.println(distance);
    }
}