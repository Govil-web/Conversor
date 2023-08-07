package com.example.conversor.operaciones;

import com.example.conversor.operaciones.LonguitudCalculo;

public class LonguitudOperaciones {
    public double valor;
    public double resultado;
    public String longuitudOrigen;
    public String longuitudDestino;
    public LonguitudCalculo longuitudCalculo = new LonguitudCalculo();

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setLonguitudOrigen(String longuitudOrigen){
        this.longuitudOrigen = longuitudOrigen;
    }
    public void setLonguitudDestino(String longuitudDestino) {
        this.longuitudDestino = longuitudDestino;
    }

    public double convertlonguitud(){
        if(longuitudOrigen.equals("Metro")){
            switch (longuitudDestino){
                case "Centimetro" -> resultado = longuitudCalculo.deMtrACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.deMtrAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.deMtrAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.deMtrAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deMtrAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.deMtrAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.deMtrAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Centimetro")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.deCenAMtr(valor);
                case "Milimetro" -> resultado = longuitudCalculo.deCenAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.deCenAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.deCenAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deCenAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.deCenAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.deCenAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Milimetro")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.deMilAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.deMilACen(valor);
                case "Kilometro" -> resultado = longuitudCalculo.deMilAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.deMilAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deMilAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.deMilAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.deMilAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Kilometro")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.deKilAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.deKilACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.deKilAMil(valor);
                case "Pie" -> resultado = longuitudCalculo.deKilAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deKilAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.deKilAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.deKilAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Pie")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.dePieAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.dePieACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.dePieAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.dePieAKil(valor);
                case "Pulgada" -> resultado = longuitudCalculo.dePieAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.dePieAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.dePieAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Pulgada")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.dePulAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.dePulACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.dePulAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.dePulAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.dePulAPie(valor);
                case "Yarda" -> resultado = longuitudCalculo.dePulAYar(valor);
                case "Milla" -> resultado = longuitudCalculo.dePulAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Yarda")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.deYarAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.deYarACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.deYarAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.deYarAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.deYarAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deYarAPul(valor);
                case "Milla" -> resultado = longuitudCalculo.deYarAMilla(valor);
            }
        }
        if(longuitudOrigen.equals("Milla")) {
            switch (longuitudDestino) {
                case "Metro" -> resultado = longuitudCalculo.deMillaAMtr(valor);
                case "Centimetro" -> resultado = longuitudCalculo.deMillaACen(valor);
                case "Milimetro" -> resultado = longuitudCalculo.deMillaAMil(valor);
                case "Kilometro" -> resultado = longuitudCalculo.deMillaAKil(valor);
                case "Pie" -> resultado = longuitudCalculo.deMillaAPie(valor);
                case "Pulgada" -> resultado = longuitudCalculo.deMillaAPul(valor);
                case "Yarda" -> resultado = longuitudCalculo.deMillaAYar(valor);
            }
        }
        return resultado;

    }

}
