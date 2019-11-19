package com.company;

public class Main {
    public static void main(String args[]) {
        TemperatureConverter temperatureConverter = new TemperatureConverter(10, 15, 18);
        temperatureConverter.convertFarenheitToCelsius();
        temperatureConverter.convertFarenheitToKelvin();

        temperatureConverter.convertCelsiusToFarenheit();
        temperatureConverter.convertCelsiusToKelvin();

        temperatureConverter.convertKelvinToCelsius();
        temperatureConverter.convertKelvinToFarenheit();
    }
}