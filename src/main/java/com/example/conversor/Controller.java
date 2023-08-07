package com.example.conversor;

import com.example.conversor.model.Currency;
import com.example.conversor.model.Longuitud;
import com.example.conversor.model.Temperature;
import com.example.conversor.operaciones.CurrencyOperaciones;
import com.example.conversor.operaciones.LonguitudOperaciones;
import com.example.conversor.operaciones.TemperatureCalculo;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class Controller implements Initializable {

    private Currency currencyManager;
    private Temperature temperatureManager;
    private CurrencyOperaciones currencyOperaciones;
    private TemperatureCalculo temperatureCalculo;
    private LonguitudOperaciones longuitudOperaciones;
    private Longuitud lengthManager;
    @FXML
    private ImageView cursorIndex;
    @FXML
    private ImageView cursorCurrency;
    @FXML
    private ImageView cursorMedidas;
    @FXML
    private ImageView cursorTemperature;
    @FXML
    private AnchorPane indexPane;
    @FXML
    private AnchorPane currencyPane;
    @FXML
    private AnchorPane temperaturePane;
    @FXML
    private AnchorPane medidasPane;
    @FXML
    private ComboBox<Object> comboBoxCurrencyFrom;
    @FXML
    private ComboBox<Object> comboBoxCurrencyTo;
    @FXML
    private ComboBox<Object> comboBoxTemperatureFrom;
    @FXML
    private ComboBox<Object> comboBoxTemperatureTo;
    @FXML
    private ComboBox<Object> comboBoxLengthFrom;
    @FXML
    private ComboBox<Object> comboBoxLengthTo;
    @FXML
    private TextField amountCurrency;
    @FXML
    private TextField amountTemperature;
    @FXML
    private TextField amountLength;
    @FXML
    private TextField convertedAmount;
    @FXML
    private TextField convertedAmountTemp;
    @FXML
    private TextField convertedAmountLen;
    @FXML
    private Button buttonCurrency;
    @FXML
    private Button buttonTemp;
    @FXML
    private Button buttonLon;
    DoubleProperty valorResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        amountCurrency.addEventFilter(KeyEvent.ANY, handlerNumeros);
        amountTemperature.addEventFilter(KeyEvent.ANY, handlerNumeros);
        amountLength.addEventFilter(KeyEvent.ANY, handlerNumeros);

        currencyOperaciones = new CurrencyOperaciones();
        temperatureCalculo = new TemperatureCalculo();
        longuitudOperaciones = new LonguitudOperaciones();
        valorResultado = new SimpleDoubleProperty();

        currencyManager = new Currency();
        comboBoxCurrencyFrom.setItems(currencyManager.getComboBoxCurrencyFromContent());
        temperatureManager = new Temperature();
        comboBoxTemperatureFrom.setItems(temperatureManager.getComboBoxTemperatureFromContent());
        lengthManager = new Longuitud();
        comboBoxLengthFrom.setItems(lengthManager.getComboBoxLengthFromContent());
    }
    public void exitOnButtomClicked(MouseEvent mouseEvent) {
        Platform.exit();
        System.exit(0);

    }
    public void convertButtomClicked(MouseEvent mouseEvent) {
        indexPane.setVisible(true);
        cursorIndex.setVisible(true);

        currencyPane.setVisible(false);
        temperaturePane.setVisible(false);
        medidasPane.setVisible(false);
        cursorCurrency.setVisible(false);
        cursorTemperature.setVisible(false);
        cursorMedidas.setVisible(false);
    }
    public void convertCurrencyClicked(MouseEvent mouseEvent) {
        currencyPane.setVisible(true);
        cursorCurrency.setVisible(true);

        indexPane.setVisible(false);
        temperaturePane.setVisible(false);
        medidasPane.setVisible(false);
        cursorIndex.setVisible(false);
        cursorTemperature.setVisible(false);
        cursorMedidas.setVisible(false);

    }
    public void convertMeasurementClicked(MouseEvent mouseEvent) {
        medidasPane.setVisible(true);
        cursorMedidas.setVisible(true);

        indexPane.setVisible(false);
        currencyPane.setVisible(false);
        temperaturePane.setVisible(false);
        cursorIndex.setVisible(false);
        cursorCurrency.setVisible(false);
        cursorTemperature.setVisible(false);
    }

    public void convertTemperatureClicked(MouseEvent mouseEvent) {
        temperaturePane.setVisible(true);
        cursorTemperature.setVisible(true);

        indexPane.setVisible(false);
        currencyPane.setVisible(false);
        medidasPane.setVisible(false);
        cursorIndex.setVisible(false);
        cursorCurrency.setVisible(false);
        cursorMedidas.setVisible(false);
    }

    EventHandler<KeyEvent> handlerNumeros = new EventHandler<>() {
        private boolean willConsume = false;
        private final int MAXLENGTH = 10;
        @Override
        public void handle(KeyEvent keyEvent) {
            TextField temp = (TextField) keyEvent.getSource();
            if (willConsume) {
                keyEvent.consume();
            }
            if (!keyEvent.getText().matches("[0-9-.]") && keyEvent.getCode() != KeyCode.BACK_SPACE) {
                if (keyEvent.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = true;
                } else if (keyEvent.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }
            if (temp.getText().length() > MAXLENGTH - 1) {
                if (keyEvent.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = true;
                } else if (keyEvent.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }
        }
    };
    public void onComboCurrencyFrom(ActionEvent actionEvent) {
        comboBoxCurrencyTo.setDisable(false);
        for (int i = 0; i < currencyManager.getSize(); i++) {
            if (comboBoxCurrencyFrom.getValue().equals(currencyManager.getComboBoxCurrencyFromContent(i))) {
                comboBoxCurrencyTo.setItems(currencyManager.getComboBoxCurrencyToContent(i));
            }
        }
    }
    public void onComboTemperatureFrom(ActionEvent actionEvent) {
        comboBoxTemperatureTo.setDisable(false);
        for (int i = 0; i < temperatureManager.getSize(); i++) {
            if (comboBoxTemperatureFrom.getValue().equals(temperatureManager.getComboBoxTemperatureFromContent(i))) {
                comboBoxTemperatureTo.setItems(temperatureManager.getComboBoxTemperatureToContent(i));
            }
        }

    }
    public void onComboLengthFrom(ActionEvent actionEvent) {
        comboBoxLengthTo.setDisable(false);
        for (int i = 0; i < lengthManager.getSize(); i++) {
            if (comboBoxLengthFrom.getValue().equals(lengthManager.getComboBoxLengthFromContent(i))) {
                comboBoxLengthTo.setItems(lengthManager.getComboBoxLengthToContent(i));
            }
        }
    }
    public void onAmountCurrency(ActionEvent actionEvent){
        comboBoxCurrencyTo.setDisable(false);
        amountCurrency.setDisable(false);
    }
    @FXML
    private void botonCovert(MouseEvent actionEvent) {
        String valorACambiar = amountCurrency.getText();
        if(valorACambiar.equals("0")  ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor mayor a cero!!");
            alert.showAndWait();
        }else{
            valorACambiar = amountCurrency.getText();
        }
        String comboFrom = (String) comboBoxCurrencyFrom.getValue();
        String comboTo = (String) comboBoxCurrencyTo.getValue();
        double valorIngresado;
        try{
            valorIngresado = parseDouble(valorACambiar);
            currencyOperaciones.setValor(valorIngresado);

            currencyOperaciones.setDivisaOrigen(comboFrom);
            currencyOperaciones.setDivisaDestino(comboTo);
            if(comboFrom.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor!!");
                alert.showAndWait();
            }
            if(comboTo.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor!!");
                alert.showAndWait();
            }else{
                buttonCurrency.setDisable(false);
                double resultado = currencyOperaciones.convert();
                convertedAmount.textProperty().bindBidirectional(valorResultado, DecimalFormat.getNumberInstance());
                double resultadoGuardado = resultado;
                valorResultado.setValue(resultadoGuardado);
                //convertedAmount.appendText(String.valueOf(((resultadoGuardado))));
                System.out.println(resultadoGuardado);
            }
        } catch (NumberFormatException e ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor!!");
            alert.showAndWait();
        } catch (Exception e ){
            e.printStackTrace(System.err);
            }
    }

    public void botonBorrar(MouseEvent actionEvent)  {
        comboBoxCurrencyFrom.setValue("");
        comboBoxCurrencyTo.setValue("");
        amountCurrency.setText("");
        double valor = 0.0;
        String valorString = Double.toString(valor);
        convertedAmount.setText(valorString);
    }
    @FXML
    private void botonCovertTemp(MouseEvent actionEvent) {

        String valorACambiar = amountTemperature.getText();
        if(valorACambiar.equals("0")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor mayor a cero!!");
            alert.showAndWait();
        }else{
            valorACambiar = amountTemperature.getText();
        }
        String comboFrom = (String) comboBoxTemperatureFrom.getValue();
        String comboTo = (String) comboBoxTemperatureTo.getValue();
        double valorIngresado;
        try{
            valorIngresado = parseDouble(valorACambiar);
            temperatureCalculo.setValorTemp(valorIngresado);

            temperatureCalculo.setTempInicial(comboFrom);
            temperatureCalculo.setTempFinal(comboTo);
            if(comboFrom.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor!!");
                alert.showAndWait();
            }
            if(comboTo.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor!!");
                alert.showAndWait();
            }else{
                buttonTemp.setDisable(false);
                double resultado = temperatureCalculo.convertTemp();
                convertedAmountTemp.textProperty().bindBidirectional(valorResultado, DecimalFormat.getNumberInstance());
                //amountTemperature.setText(String.valueOf(resultado));
                double resultadoGuardadoTemp = resultado;
                valorResultado.setValue(resultadoGuardadoTemp);
                //convertedAmountTemp.appendText(String.valueOf(resultadoGuardadoTemp));
            }

        } catch (NumberFormatException e ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor!!");
            alert.showAndWait();
        } catch (Exception e ){
            e.printStackTrace(System.err);
        }
    }
    public void onAmountTemperature(ActionEvent actionEvent){
        comboBoxTemperatureTo.setDisable(false);
        amountTemperature.setDisable(false);
    }
    public void botonBorrarTemp(MouseEvent actionEvent)  {
        comboBoxTemperatureFrom.setValue("");
        comboBoxTemperatureTo.setValue("");
        amountTemperature.setText("");
        double valor = 0.0;
        String valorString = Double.toString(valor);
        convertedAmountTemp.setText(valorString);
    }

    @FXML
    private void botonCovertLon(MouseEvent actionEvent) {

        String valorACambiar = amountLength.getText();
        if(valorACambiar.equals("0")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor mayor a cero!!");
            alert.showAndWait();
        }else{
            valorACambiar = amountLength.getText();
        }
        String comboFrom = (String) comboBoxLengthFrom.getValue();
        String comboTo = (String) comboBoxLengthTo.getValue();
        double valorIngresado;
        try{
            valorIngresado = parseDouble(valorACambiar);
            longuitudOperaciones.setValor(valorIngresado);

            longuitudOperaciones.setLonguitudOrigen(comboFrom);
            longuitudOperaciones.setLonguitudDestino(comboTo);
            if(comboFrom.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor mayor a cero!!");
                alert.showAndWait();
            }
            if(comboTo.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ingresar Informacion");
                alert.setContentText("Debe ingresar un valor mayor a cero!!");
                alert.showAndWait();
            }else{
                buttonLon.setDisable(false);
                double resultado = longuitudOperaciones.convertlonguitud();
                convertedAmountLen.textProperty().bindBidirectional(valorResultado, DecimalFormat.getNumberInstance());
                //convertedAmountLen.setText(String.valueOf(resultado));
                double resultadoLon = resultado;
                valorResultado.setValue(resultadoLon);
                //convertedAmountLen.appendText(String.valueOf(resultadoLon));
            }
        } catch (NumberFormatException e ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ingresar Informacion");
            alert.setContentText("Debe ingresar un valor!!");
            alert.showAndWait();
        } catch (Exception e ){
            e.printStackTrace(System.err);
        }
    }
    public void onAmountLen(ActionEvent actionEvent){
        comboBoxLengthTo.setDisable(false);
        amountLength.setDisable(false);
    }
    public void botonBorrarLon(MouseEvent actionEvent){
        comboBoxLengthFrom.setValue("");
        comboBoxLengthTo.setValue("");
        amountLength.setText("");
        double valor = 0.0;
        String valorString = Double.toString(valor);
        convertedAmountLen.setText(valorString);    }
}