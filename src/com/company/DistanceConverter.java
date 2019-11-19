package com.company;

public class DistanceConverter {
    private double meter;
    private double mile;

    public DistanceConverter(double meter, double mile) {
        this.meter = meter;
        this.mile = mile;
    }

    public DistanceConverter() {
    }

    //region Getter and setter
    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }
    //endregion

    public void convertMetersToMiles() {
        double mile = this.meter / 1609.344;
        System.out.println("MetersToMiles = " + mile + " mi");
    }

    public void convertMilesToMeters() {
        double meter = this.mile * 1609.344;
        System.out.println("MilesToMeters = " + meter + " m");
    }
}
