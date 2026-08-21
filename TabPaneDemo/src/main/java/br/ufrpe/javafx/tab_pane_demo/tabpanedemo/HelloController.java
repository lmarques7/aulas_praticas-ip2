package br.ufrpe.javafx.tab_pane_demo.tabpanedemo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

public class HelloController {

    @FXML
    private DatePicker dtPickerInicial;

    @FXML
    private DatePicker dtPickerFinal;

    @FXML
    public void onDiferencaPressionado() {
        int diff = dtPickerInicial.getValue().until(dtPickerFinal.getValue()).getDays();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Janela modal");
        alert.setHeaderText("Diferença de datas em dias");
        alert.setContentText("Difereça é: " + diff + " dias");
        alert.show();
    }
}