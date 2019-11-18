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
        if (this.cordinateX != 0 && this.cordinateY != 0) {
            double distance = Math.sqrt(Math.pow(this.cordinateX, 2) + Math.pow(this.cordinateY, 2));
            System.out.println(distance);
        } else if (this.cordinateX == 0) {
            System.out.println(this.cordinateY);
        } else {
            System.out.println(this.cordinateX);
        }
    }

    public void cordinantPointOneDistanceFromPointTwo(double cordinateX1, double cordinateY1) {
        if (this.cordinateX == 0 && cordinateX1 == 0) {
            double distance = this.cordinateY + cordinateY1;
            System.out.println(distance);
        } else if (this.cordinateX == 0 && cordinateX1 != 0) {
            double distance = Math.sqrt(Math.pow((this.cordinateY - cordinateY1), 2) + Math.pow(cordinateX1, 2));
            System.out.println(distance);
        } else if (cordinateX1 == 0 && this.cordinateX != 0) {
            double distance = Math.sqrt(Math.pow((this.cordinateY - cordinateY1), 2) + Math.pow(this.cordinateX, 2));
            System.out.println(distance);
        } else if (this.cordinateY == 0 && cordinateY1 == 0) {
            double distance = this.cordinateX + cordinateX1;
            System.out.println(distance);
        } else if (this.cordinateY == 0 && cordinateY1 != 0) {
            double distance = Math.sqrt(Math.pow((this.cordinateX - cordinateX1), 2) + Math.pow(cordinateY1, 2));
            System.out.println(distance);
        } else if (cordinateY1 == 0 && this.cordinateY != 0) {
            double distance = Math.sqrt(Math.pow((this.cordinateX - cordinateX1), 2) + Math.pow(this.cordinateY, 2));
            System.out.println(distance);
        } else if (cordinateX1 != 0 && cordinateY1 != 0 && this.cordinateY != 0 && this.cordinateX != 0) {
            double distance = Math.sqrt(Math.pow((this.cordinateY - cordinateY1), 2) + Math.pow((this.cordinateX - cordinateX1), 2));
            System.out.println(distance);
        } else if (this.cordinateX == 0 && cordinateY1 == 0) {
            double distance = Math.sqrt(Math.pow(cordinateX1, 2) + Math.pow(this.cordinateY, 2));
            System.out.println(distance);
        } else if (cordinateX1 == 0 && this.cordinateY == 0) {
            double distance = Math.sqrt(Math.pow(this.cordinateX, 2) + Math.pow(cordinateY1, 2));
            System.out.println(distance);
        } else if (this.cordinateX == 0 && this.cordinateY == 0) {
            double distance = Math.sqrt(Math.pow(cordinateX1, 2) + Math.pow(cordinateY1, 2));
            System.out.println(distance);
        } else {
            double distance = Math.sqrt(Math.pow(this.cordinateX, 2) + Math.pow(this.cordinateY, 2));
        }
    }
}
