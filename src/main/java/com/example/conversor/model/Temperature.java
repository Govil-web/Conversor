package com.example.conversor.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Temperature {

    ArrayList<ObservableList<Object>> temperatureItems = new ArrayList<>();
    ObservableList<Object> comboBoxTemperatureFromContent =
            FXCollections.observableArrayList(
                    "Celcius",
                    "Farenheit",
                    "kelvin"
            );
    ObservableList<Object> comboBoxTemperatureToContentCel =
            FXCollections.observableArrayList(
                    "Farenheit",
                    "kelvin"
            );
    ObservableList<Object> comboBoxTemperatureToContentFar =
            FXCollections.observableArrayList(
                    "Celsius",
                    "kelvin"
            );
    ObservableList<Object> comboBoxTemperatureToContentKel =
            FXCollections.observableArrayList(
                    "Celsius",
                    "Farenheit"

            );

    public Temperature(){
        temperatureItems.add(comboBoxTemperatureToContentCel);
        temperatureItems.add(comboBoxTemperatureToContentFar);
        temperatureItems.add(comboBoxTemperatureToContentKel);
    }
    public ObservableList<Object> getComboBoxTemperatureFromContent(){
        return comboBoxTemperatureFromContent;
    }
    public ObservableList<Object> getComboBoxTemperatureToContent(int index) {
        return temperatureItems.get(index);
    }
    public Object getComboBoxTemperatureFromContent(int index){
        return  comboBoxTemperatureFromContent.get(index);
    }
    public int getSize(){
        return comboBoxTemperatureFromContent.size();
    }

}
