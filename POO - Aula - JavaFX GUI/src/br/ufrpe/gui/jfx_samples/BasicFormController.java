package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class BasicFormController {
    
    @FXML
    protected Button btnCadastrar;
    
    @FXML
    public void botaoCadastrarPressionado(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmação");
        alert.setContentText("Tem certeza que deseja cadastrar?");
        alert.showAndWait();
        this.btnCadastrar.setText("CADASTRAR");
    }

}
