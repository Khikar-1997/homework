package com.company;

public class TemperatureConverter {
    private double kelvin;
    private double celsius;
    private double farenheit;

    public TemperatureConverter(double kelvin, double celsius, double farenheit) {
        this.kelvin = kelvin;
        this.celsius = celsius;
        this.farenheit = farenheit;
    }

    public TemperatureConverter() {
    }

    //region Getter and setter
    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }
    //endregion

    public void convertFarenheitToCelsius() {
        double celsius = (this.farenheit - 32) * 5 / 9;
        System.out.println("FarenheitToCelsius = " + celsius + " °C");
    }

    public void convertFarenheitToKelvin() {
        double kelvin = ((this.farenheit - 32) * 5 / 9) + 273.15;
        System.out.println("FarenheitToKelvin = " + kelvin + " K");
    }

    public void convertCelsiusToFarenheit() {
        double farenheit = (this.celsius * 9 / 5) + 32;
        System.out.println("CelsiusToFarenheit = " + farenheit + " °F");
    }

    public void convertCelsiusToKelvin() {
        double kelvin = this.celsius + 273.15;
        System.out.println("CelsiusToKelvin = " + kelvin + " K");
    }

    public void convertKelvinToFarenheit() {
        double fahrenheit = (((this.kelvin - 273.15) * 9 / 5)) + 32;
        System.out.println("KelvinToFarenheit = " + fahrenheit + " °F");
    }

    public void convertKelvinToCelsius() {
        double celsius = this.kelvin - 273.15;
        System.out.println("KelvinToCelsius = " + celsius + " °C");
    }
}
