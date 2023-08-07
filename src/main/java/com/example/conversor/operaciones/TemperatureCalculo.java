package com.example.conversor.operaciones;

public class TemperatureCalculo {

    public double valorTemp;
    public String tempInicial;
    public String tempFinal;
    public double resultTemp;

    TemperatureOperaciones temperatureOperaciones = new TemperatureOperaciones();

    public TemperatureCalculo() {
    }
    public void setValorTemp(double valorTemp) {
        this.valorTemp = valorTemp;
    }
    public void setTempInicial(String tempInicial) {
        this.tempInicial = tempInicial;
    }
    public void setTempFinal(String tempFinal) {
        this.tempFinal = tempFinal;
    }

    public double convertTemp(){
        if(tempInicial.equals("Celcius")) {
            switch (tempFinal) {
                case "Farenheit" -> resultTemp = temperatureOperaciones.deCelAFahren(valorTemp);
                case "kelvin" -> resultTemp = temperatureOperaciones.deCelAKel(valorTemp);
            }
        }
        if(tempInicial.equals("Farenheit")) {
            switch (tempFinal) {
                case "Celcius" -> resultTemp = temperatureOperaciones.deFahrenACel(valorTemp);
                case "kelvin" -> resultTemp = temperatureOperaciones.deFahrenAKel(valorTemp);
            }
            }
        if(tempInicial.equals("kelvin")){
            switch (tempFinal){
                    case "Celcius" -> resultTemp = temperatureOperaciones.deKelACel(valorTemp);
                    case "Farenheit" -> resultTemp = temperatureOperaciones.deKelAFahren(valorTemp);
                }
        }
        return resultTemp;
    }
}
