package com.company;

public class CurrencyConverter {
    private double dollar;
    private double euro;
    private double dram;
    private double ruble;

    public CurrencyConverter(double dollar, double euro, double dram, double ruble) {
        this.dollar = dollar;
        this.euro = euro;
        this.dram = dram;
        this.ruble = ruble;
    }

    public CurrencyConverter() {
    }

    //region Getter and setter
    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDram() {
        return dram;
    }

    public void setDram(double dram) {
        this.dram = dram;
    }

    public double getRuble() {
        return ruble;
    }

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }
    //endregion

    public void convertDollarToEuro() {
        double euro = this.dollar * 0.9;
        System.out.println("DollarToEuro = " + euro + " EUR");
    }

    public void convertDollarToDram() {
        double dram = this.dollar * 477.4;
        System.out.println("DollarToDram = " + dram + " AMD");
    }

    public void convertDollarToRuble() {
        double ruble = this.dollar * 63.7;
        System.out.println("DollarToRuble = " + ruble + " RUB");
        System.out.println();
    }

    public void convertEuroToDollar() {
        double dollar = this.euro * 1.11;
        System.out.println("EuroToDollar = " + dollar + " USD");
    }

    public void convertEuroToDram() {
        double dram = this.euro * 528.39;
        System.out.println("EuroToDram = " + dram + " AMD");
    }

    public void convertEuroToRuble() {
        double ruble = this.euro * 70.55;
        System.out.println("EuroToRuble = " + ruble + " RUB");
        System.out.println();
    }

    public void convertDramToDollar() {
        double dollar = this.dram * 0.0021;
        System.out.println("DramToDollar = " + dollar + " USD");
    }

    public void convertDramToEuro() {
        double euro = this.dram * 0.0019;
        System.out.println("DramToEuro = " + euro + " EUR");
    }

    public void convertDramToRuble() {
        double ruble = this.dram * 0.13;
        System.out.println("DramToRuble = " + ruble + " RUB");
        System.out.println();
    }

    public void convertRubleToDollar() {
        double dollar = this.ruble * 0.016;
        System.out.println("RubleToDollar = " + dollar + " USD");
    }

    public void convertRubleToEuro() {
        double euro = this.ruble * 0.014;
        System.out.println("RubleToEuro = " + euro + " EUR");
    }

    public void convertRubleToDram() {
        double dram = this.ruble * 7.49;
        System.out.println("RubleToDram = " + dram + " AMD");
    }
}
