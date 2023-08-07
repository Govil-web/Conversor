package com.example.conversor.operaciones;



import com.example.conversor.connection.APIClient;

import java.util.Map;

public class DatosCurrency {

    APIClient apiClient = new APIClient();
    public DatosCurrency() {

    }
    private Map<String, Double> data;

    public Map<String, Double> getData() {
        return data;
    }

    public void setData(Map<String, Double> data) {
        this.data = data;
    }
    public Double obtenerValorMoneda(String codigoMoneda) {
        return data.get(codigoMoneda);
    }



}