package com.company;

public class Main {
    public static void main(String args[]) {
        DistanceConverter distanceConverter = new DistanceConverter(5,100);

        distanceConverter.convertMilesToMeters();
        distanceConverter.convertMetersToMiles();
    }
}