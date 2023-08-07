package com.example.conversor.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Longuitud {
    ArrayList<ObservableList<Object>> lengthItems = new ArrayList<>();
    ObservableList<Object> comboBoxLengthFromContent =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentMetro =
            FXCollections.observableArrayList(
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentCentimetro =
            FXCollections.observableArrayList(
                    "Metro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentMilimetro =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentKilometro =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Pie",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentPie =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pulgada",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentPulgada =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Yarda",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentYarda =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Milla"
            );
    ObservableList<Object> comboBoxLengthToContentMilla =
            FXCollections.observableArrayList(
                    "Metro",
                    "Centimetro",
                    "Milimetro",
                    "Kilometro",
                    "Pie",
                    "Pulgada",
                    "Yarda"
            );
    public Longuitud(){
        lengthItems.add(comboBoxLengthToContentMetro);
        lengthItems.add(comboBoxLengthToContentCentimetro);
        lengthItems.add(comboBoxLengthToContentMilimetro);
        lengthItems.add(comboBoxLengthToContentKilometro);
        lengthItems.add(comboBoxLengthToContentPie);
        lengthItems.add(comboBoxLengthToContentPulgada);
        lengthItems.add(comboBoxLengthToContentYarda);
        lengthItems.add(comboBoxLengthToContentMilla);
    }

    public ObservableList<Object> getComboBoxLengthFromContent(){
        return comboBoxLengthFromContent;
    }

    public ObservableList<Object> getComboBoxLengthToContent(int index) {
        return lengthItems.get(index);
    }

    public Object getComboBoxLengthFromContent(int index){
        return  comboBoxLengthFromContent.get(index);
    }
    public int getSize(){
        return comboBoxLengthFromContent.size();
    }
}
