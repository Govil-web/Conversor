package com.example.conversor.operaciones;

import com.example.conversor.operaciones.CurrencyCalculo;

public class CurrencyOperaciones {

    public Double valor;
    public String divisaOrigen;
    public String divisaDestino;
    public double resultado;

    public CurrencyCalculo currencyCalculo = new CurrencyCalculo();
    public CurrencyOperaciones() {
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setDivisaOrigen(String divisaOrigen) {
        this.divisaOrigen = divisaOrigen;
    }
    public void setDivisaDestino(String divisaDestino) {
        this.divisaDestino = divisaDestino;
    }
    public double convert(){
        if (divisaOrigen.equals("BRL")) {
            switch (divisaDestino) {
                case "USD" -> resultado = currencyCalculo.brlADollar(valor);
                case "EUR" -> resultado = currencyCalculo.brlAEuro(valor);
                case "GBP" -> resultado = currencyCalculo.brlAlibra(valor);
                case "MXN" -> resultado = currencyCalculo.brlAMxn(valor);
                case "CNY" -> resultado = currencyCalculo.brlACny(valor);
                case "JPY" -> resultado = currencyCalculo.brlAJpy(valor);
            }
        }
        if (divisaOrigen.equals("USD")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.dollarABrl(valor);
                case "EUR" ->  resultado = currencyCalculo.dollarAEuro(valor);
                case "GBP" ->  resultado = currencyCalculo.dollarALibra(valor);
                case "MXN" ->  resultado = currencyCalculo.dollarAMxn(valor);
                case "CNY" ->  resultado = currencyCalculo.dollarACny(valor);
                case "JPY" ->  resultado = currencyCalculo.dollarAYen(valor);
                //default -> resultado = 0.00;
            }
        }
        if (divisaOrigen.equals("EUR")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.euroABrl(valor);
                case "USD" ->  resultado = currencyCalculo.euroADollar(valor);
                case "GBP" ->  resultado = currencyCalculo.euroALibra(valor);
                case "MXN" ->  resultado = currencyCalculo.euroAMxn(valor);
                case "CNY" ->  resultado = currencyCalculo.euroACny(valor);
                case "JPY" ->  resultado = currencyCalculo.euroAYen(valor);
                //default -> resultado = 0.00;
            }
        }
        if (divisaOrigen.equals("GBP")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.libraABrl(valor);
                case "EUR" ->  resultado = currencyCalculo.libraAEuro(valor);
                case "USD" ->  resultado = currencyCalculo.libraADollar(valor);
                case "MXN" ->  resultado = currencyCalculo.libraAMxn(valor);
                case "CNY" ->  resultado = currencyCalculo.libraACny(valor);
                case "JPY" ->  resultado = currencyCalculo.libraAYen(valor);
                //default -> resultado = 0.00;
            }
        }
        if (divisaOrigen.equals("MXN")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.mxnABrl(valor);
                case "EUR" ->  resultado = currencyCalculo.mxnAEuro(valor);
                case "GBP" ->  resultado = currencyCalculo.mxnALibra(valor);
                case "USD" ->  resultado = currencyCalculo.mxnADollar(valor);
                case "CNY" ->  resultado = currencyCalculo.mxnACny(valor);
                case "JPY" ->  resultado = currencyCalculo.mxnAYen(valor);
                //default -> resultado = 0.00;
            }
        }
        if (divisaOrigen.equals("CNY")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.cnyABrl(valor);
                case "EUR" ->  resultado = currencyCalculo.cnyAEuro(valor);
                case "GBP" ->  resultado = currencyCalculo.cnyALibra(valor);
                case "MXN" ->  resultado = currencyCalculo.cnyAMxn(valor);
                case "USD" ->  resultado = currencyCalculo.cnyADollar(valor);
                case "JPY" ->  resultado = currencyCalculo.cnyAYen(valor);
                //default -> resultado = 0.00;
            }
        }

        if (divisaOrigen.equals("JPY")) {
            switch (divisaDestino) {
                case "BRL" -> resultado = currencyCalculo.yenABrl(valor);
                case "EUR" ->  resultado = currencyCalculo.yenAEuro(valor);
                case "GBP" ->  resultado = currencyCalculo.yenALibra(valor);
                case "MXN" ->  resultado = currencyCalculo.yenAMxn(valor);
                case "CNY" ->  resultado = currencyCalculo.yenACny(valor);
                case "USD" ->  resultado = currencyCalculo.yenADollar(valor);
                //default -> resultado = 0.00;
            }
        }
        return resultado;

    }
}
