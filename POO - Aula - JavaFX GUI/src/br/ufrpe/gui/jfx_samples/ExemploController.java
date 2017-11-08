package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ExemploController {
    
    @FXML
    private Button btnExecutar;
    
    @FXML
    private Button btnSalvar;
    
    @FXML
    public void btnExecutarAction(ActionEvent e) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Valor que eu quiser");
        alert.setContentText("Valor de um txtField: " + 15);
        alert.showAndWait();
    }

}
