package com.example.conversor.connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApi {
    public  String readApiKeyFromFile(String fileName) {
        StringBuilder apiKey = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                apiKey.append(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiKey.toString();
    }
}
