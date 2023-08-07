package com.example.conversor.operaciones;

import com.example.conversor.connection.APIClient;

public class CurrencyCalculo {

    APIClient apiClient = new APIClient();
    double brlADollar = apiClient.obtenerDatosMonedaBRL("USD");
    double brlAEuro = apiClient.obtenerDatosMonedaBRL("EUR");
    double brlALibraEsterlina =apiClient.obtenerDatosMonedaBRL("GBP");
    double brlAYuanChino = apiClient.obtenerDatosMonedaBRL("CNY");
    double brlAYenJapones = apiClient.obtenerDatosMonedaBRL("JPY");
    double brlAPesoMexicano = apiClient.obtenerDatosMonedaBRL("MXN");


    //-------- De Real Brazil a Otras

    public double brlACny(double valor){
        double moneda = valor * brlAYuanChino;
        moneda = (double)Math.round(moneda * 10d)/10;
        return moneda;
    }
 public double brlAEuro(double valor){
        double moneda = valor * brlAEuro;
        moneda = (double)Math.round(moneda * 100d)/100;
        return moneda;
 }
 public double brlAlibra(double valor){
        double moneda = valor * brlALibraEsterlina;
        moneda = (double)Math.round(moneda * 100d)/100;
        return moneda;
 }
 public double brlAMxn(double valor){
        double moneda = valor * brlAPesoMexicano;
        moneda = (double)Math.round(moneda * 100d)/100;
        return moneda;
 }
 public double brlADollar(double valor) {
     double moneda = valor * brlADollar;
     moneda = (double)Math.round(moneda * 100d)/100;
     return moneda;
 }
 public double brlAJpy(double valor){
        double moneda = valor * brlAYenJapones;
     moneda = (double)Math.round(moneda * 100d)/100;
     return moneda;
 }

 //---De Dollar a otras
    double dollarAEuro = apiClient.obtenerDatosMonedaUSD("EUR");
    double dollarARealBrazil = apiClient.obtenerDatosMonedaUSD("BRL");
    double dollarALibra = apiClient.obtenerDatosMonedaUSD("GBP");
    double dollarAYuan = apiClient.obtenerDatosMonedaUSD("CNY");
    double dollarAYen = apiClient.obtenerDatosMonedaUSD("JPY");
    double dollarAPesoMex = apiClient.obtenerDatosMonedaUSD("MXN");
    public Double dollarABrl(double valor) {
        double moneda = valor * dollarARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double dollarAEuro(double valor) {
        double moneda = valor * dollarAEuro;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double dollarALibra(double valor) {
        double moneda = valor * dollarALibra;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double dollarAMxn(double valor) {
        double moneda = valor * dollarAPesoMex;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double dollarACny(double valor) {
        double moneda = valor * dollarAYuan;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double dollarAYen(double valor) {
        double moneda = valor * dollarAYen;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

    //----------De Euro a otras

    double euroADollar= apiClient.obtenerDatosMonedaEUR("USD");
    double euroARealBrazil = apiClient.obtenerDatosMonedaEUR("BRL");
    double euroAlibraEsterlina =apiClient.obtenerDatosMonedaEUR("GBP");
    double euroAYuanChino = apiClient.obtenerDatosMonedaEUR("CNY");
    double euroAYenjapones = apiClient.obtenerDatosMonedaEUR("JPY");
    double euroAPesoMex = apiClient.obtenerDatosMonedaEUR("MXN");

    public Double euroABrl(double valor) {
        double moneda = valor * euroARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double euroADollar(double valor) {
        double moneda = valor * euroADollar;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double euroALibra(double valor) {
        double moneda = valor * euroAlibraEsterlina;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double euroAMxn(double valor) {
        double moneda = valor * euroAPesoMex;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double euroACny(double valor) {
        double moneda = valor * euroAYuanChino;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double euroAYen(double valor) {
        double moneda = valor * euroAYenjapones;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }


    // De libra esterlina a otras
    double libraAEuro = apiClient.obtenerDatosMonedaGBP("EUR");
    double libraARealBrazil = apiClient.obtenerDatosMonedaGBP("BRL");
    double libraADollar =apiClient.obtenerDatosMonedaGBP("USD");
    double libraAYuanChino = apiClient.obtenerDatosMonedaGBP("CNY");
    double libraAYenJapones = apiClient.obtenerDatosMonedaGBP("JPY");
    double libraAPesoMaex = apiClient.obtenerDatosMonedaGBP("MXN");



    public Double libraABrl(double valor) {
        double moneda = valor * libraARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

    public Double libraADollar(double valor) {
        double moneda = valor * libraADollar;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double libraAEuro(double valor) {
        double moneda = valor * libraAEuro;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double libraAMxn(double valor) {
        double moneda = valor * libraAPesoMaex
                ;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double libraACny(double valor) {
        double moneda = valor * libraAYuanChino;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double libraAYen(double valor) {
        double moneda = valor * libraAYenJapones;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

    //--------De pseo Mexicano a otras

    double pesoAEuro = apiClient.obtenerDatosMonedaMXN("EUR");
    double pesoARealBrazil = apiClient.obtenerDatosMonedaMXN("BRL");
    double pesoALibra =apiClient.obtenerDatosMonedaMXN("GBP");
    double pesoAYuan = apiClient.obtenerDatosMonedaMXN("CNY");
    double pesoAYen = apiClient.obtenerDatosMonedaMXN("JPY");
    double pesoADollar = apiClient.obtenerDatosMonedaMXN("USD");

    public Double mxnABrl(double valor) {
        double moneda = valor * pesoARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double mxnADollar(double valor) {
        double moneda = valor * pesoADollar;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double mxnAEuro(double valor) {
        double moneda = valor * pesoAEuro;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double mxnALibra(double valor) {
        double moneda = valor * pesoALibra;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

    public Double mxnACny(double valor) {
        double moneda = valor * pesoAYuan;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double mxnAYen(double valor) {
        double moneda = valor * pesoAYen;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

//---- De Yuan Chino Extracontinental a otras

    double yuanAEuro = apiClient.obtenerDatosMonedaCNY("EUR");
    double yuanARealBrazil = apiClient.obtenerDatosMonedaCNY("BRL");
    double yuanALibra =apiClient.obtenerDatosMonedaCNY("GBP");
    double yuanADollar = apiClient.obtenerDatosMonedaCNY("USD");
    double yuanAYen = apiClient.obtenerDatosMonedaCNY("JPY");
    double yuanAPesoMex = apiClient.obtenerDatosMonedaCNY("MXN");

    public Double cnyABrl(double valor) {
        double moneda = valor * yuanARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double cnyADollar(double valor) {
        double moneda = valor * yuanADollar;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double cnyAEuro(double valor) {
        double moneda = valor * yuanAEuro;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double cnyALibra(double valor) {
        double moneda = valor * yuanALibra;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double cnyAMxn(double valor) {
        double moneda = valor * yuanAPesoMex;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double cnyAYen(double valor){
        double moneda = valor * yuanAYen;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
//-------------------Yen a otras
double yenAEuro = apiClient.obtenerDatosMonedaJPY("EUR");
    double yenARealBrazil = apiClient.obtenerDatosMonedaJPY("BRL");
    double yenALibra =apiClient.obtenerDatosMonedaJPY("GBP");
    double yenAYuan = apiClient.obtenerDatosMonedaJPY("CNY");
    double yenADollar = apiClient.obtenerDatosMonedaJPY("USD");
    double yenAPesoMex = apiClient.obtenerDatosMonedaJPY("MXN");
    public Double yenABrl(double valor) {
        double moneda = valor * yenARealBrazil;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double yenADollar(double valor) {
        double moneda = valor * yenADollar;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double yenAEuro(double valor) {
        double moneda = valor * yenAEuro;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double yenALibra(double valor) {
        double moneda = valor * yenALibra;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double yenAMxn(double valor) {
        double moneda = valor * yenAPesoMex;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }
    public Double yenACny(double valor){
        double moneda = valor * yenAYuan;
        moneda = (double) Math.round(moneda * 100d) / 100;
        return moneda;
    }

}



