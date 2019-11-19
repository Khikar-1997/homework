package com.company;

public class Main {
    public static void main(String args[]) {
        CurrencyConverter currencyConverter = new CurrencyConverter(2, 8, 100, 10);

        currencyConverter.convertDollarToEuro();
        currencyConverter.convertDollarToDram();
        currencyConverter.convertDollarToRuble();

        currencyConverter.convertEuroToDollar();
        currencyConverter.convertEuroToDram();
        currencyConverter.convertEuroToRuble();

        currencyConverter.convertDramToDollar();
        currencyConverter.convertDramToEuro();
        currencyConverter.convertDramToRuble();

        currencyConverter.convertRubleToDollar();
        currencyConverter.convertRubleToEuro();
        currencyConverter.convertRubleToDram();
    }
}