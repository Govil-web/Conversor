package com.example.conversor;

import com.example.conversor.connection.APIClient;

public class prueba {

    public static void main(String[] args) throws Exception {

        APIClient apiClient = new APIClient();
        apiClient.obtenerDatosMonedaUSD("EUR");



    }
}
