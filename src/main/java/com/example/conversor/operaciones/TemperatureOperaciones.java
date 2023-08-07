package com.example.conversor.operaciones;

public class TemperatureOperaciones {


    // De celcius a Otros
    public double deCelAKel(double valor) {
        double celKel = valor + 273.15;
        celKel = (double) Math.round(celKel * 100d) / 100;
        return celKel;
    }
    public double deCelAFahren(double valor) {
        double celFahren = (valor * 1.8) + 32;
        celFahren = (double) Math.round(celFahren * 100d) / 100;
        return celFahren;
    }
    // De kelvin a otros
    public double deKelACel(double valor) {
        double kelCell = valor - 273.15;
        kelCell = (double) Math.round(kelCell * 100d) / 100;
        return kelCell;
    }
    public double deKelAFahren(double valor){
        double kelFahren = ((valor - 273.15) * (4.8)) + 32;
        kelFahren = (double)Math.round(kelFahren * 100d)/100;
        return kelFahren;
    }
    // De Fahrenheit a otros
    public double deFahrenACel(double valor){
        double fahrenCel = (valor - 32) * (0.556);
        fahrenCel = (double)Math.round(fahrenCel * 100d)/100;
        return fahrenCel;
    }
    public double deFahrenAKel(double valor){
        double fahrenKel = (valor + 459.67) * (0.556);
        fahrenKel = (double)Math.round(fahrenKel * 100d)/100;
        return fahrenKel;
    }

}
