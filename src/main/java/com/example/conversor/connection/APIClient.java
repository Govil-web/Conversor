package com.example.conversor.connection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


import com.example.conversor.operaciones.DatosCurrency;
import com.fasterxml.jackson.databind.ObjectMapper;

public class APIClient {

        private ReadApi readApi = new ReadApi();

        final String API_KEY =  readApi.readApiKeyFromFile(".env/config.txt");
        private  final String API_URL = "https://api.freecurrencyapi.com/v1/latest?apikey=" + API_KEY;
        private  final String API_URL_DOLLAR = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN";
        private  final String API_URL_REALBRAZIL = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=BRL";
        private  final String API_URL_LIBRAESTERLINA = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=GBP";
        private  final String API_URL_YENJAPONES = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=JPY";
        private  final String API_URL_YUANCHINO = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=CNY";
        private  final String API_URL_PESOMEXICANO = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=MXN";
        private  final String API_URL_EURO = API_URL + "&currencies=USD%2CBRL%2CCNY%2CEUR%2CGBP%2CJPY%2CMXN&base_currency=EUR";


        public double obtenerDatosMonedaUSD(String moneda) {
            Double datos = 0.0;
            try {
                URL url = new URL(API_URL_DOLLAR);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
                }
                ObjectMapper mapper = new ObjectMapper();
                DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
                datos = data.obtenerValorMoneda(moneda);
                System.out.println(datos);

                return datos;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(datos);
            return datos;
        }
    public double obtenerDatosMonedaBRL(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_REALBRAZIL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            return datos;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public double obtenerDatosMonedaCNY(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_YUANCHINO);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            //System.out.println("datos = " + resultado);
            return datos;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public double obtenerDatosMonedaEUR(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_EURO);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            return datos;
            //System.out.println("datos = " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public double obtenerDatosMonedaGBP(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_LIBRAESTERLINA);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            return datos;
            //System.out.println("datos = " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public double obtenerDatosMonedaMXN(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_PESOMEXICANO);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            return datos;
            //System.out.println("datos = " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }
    public double obtenerDatosMonedaJPY(String moneda) {
        Double datos = 0.0;
        try {
            URL url = new URL(API_URL_YENJAPONES);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Ocurrió un error " + conn.getResponseCode());
            }
            ObjectMapper mapper = new ObjectMapper();
            DatosCurrency data = mapper.readValue(url, DatosCurrency.class);
            datos = data.obtenerValorMoneda(moneda);
            return datos;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return datos;
    }

}
