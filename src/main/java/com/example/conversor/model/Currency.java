package com.example.conversor.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Currency {
    ArrayList<ObservableList<Object>> currencyItems = new ArrayList<>();
    ObservableList<Object> comboBoxCurrencyFromContent =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "EUR",
                    "GBP",
                    "JPY",
                    "MXN",
                    "USD"
            );
    ObservableList<Object> comboBoxCurrencyToContentBrl =
            FXCollections.observableArrayList(
                    "CNY",
                    "EUR",
                    "GBP",
                    "JPY",
                    "MXN",
                    "USD"
            );

    ObservableList<Object> comboBoxCurrencyToContentCny =
            FXCollections.observableArrayList(
                    "BRL",
                    "EUR",
                    "GBP",
                    "JPY",
                    "MXN",
                    "USD"
            );



    ObservableList<Object> comboBoxcurrencyToContentEur =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "GBP",
                    "JPY",
                    "MXN",
                    "USD"
            );
    ObservableList<Object> comboBoxcurrencyToContentGbp =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "EUR",
                    "JPY",
                    "MXN",
                    "USD"
            );

    ObservableList<Object> comboBoxcurrencyToContentJpy =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "EUR",
                    "GBP",
                    "MXN",
                    "USD"
            );

    ObservableList<Object> comboBoxcurrencyToContentMxn =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "EUR",
                    "GBP",
                    "JPY",
                    "USD"
            );
    ObservableList<Object> comboBoxcurrencyToContentUsd =
            FXCollections.observableArrayList(
                    "BRL",
                    "CNY",
                    "EUR",
                    "GBP",
                    "JPY",
                    "MXN"
            );

    public Currency(){

        currencyItems.add(comboBoxCurrencyToContentBrl);
        currencyItems.add(comboBoxCurrencyToContentCny);
        currencyItems.add(comboBoxcurrencyToContentEur);
        currencyItems.add(comboBoxcurrencyToContentGbp);
        currencyItems.add(comboBoxcurrencyToContentJpy);
        currencyItems.add(comboBoxcurrencyToContentMxn);
        currencyItems.add(comboBoxcurrencyToContentUsd);

    }

    public ObservableList<Object> getComboBoxCurrencyFromContent(){
        return comboBoxCurrencyFromContent;
    }
    public ObservableList<Object> getComboBoxCurrencyToContent(int index) {
        return currencyItems.get(index);
    }
    public Object getComboBoxCurrencyFromContent(int index){
        return  comboBoxCurrencyFromContent.get(index);
    }
    public int getSize(){
        return comboBoxCurrencyFromContent.size();
    }
}
