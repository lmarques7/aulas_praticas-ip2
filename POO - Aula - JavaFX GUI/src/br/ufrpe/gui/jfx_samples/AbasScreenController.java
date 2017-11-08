package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AbasScreenController {
    
    @FXML
    private TextField txtFieldNome;
    
    @FXML
    private TextField txtFieldEndereco;
    
    @FXML
    private TextField txtFieldResumo;
    
    @FXML
    private TextArea txtAreaDescricao;
    
    @FXML
    private Button btnEnviar;
    
    @FXML
    public void onBtnEnviarAction(ActionEvent e) {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Information for you");
        info.setHeaderText("Cabeçalho da informação");
        info.setContentText("Você pressionou o botão enviar e o conteúdo de "
                + "txtFieldResumo é: " + txtFieldResumo.getText());
        info.showAndWait();
    }
    
    @FXML
    public void onBtnPeriodoAction(ActionEvent e) {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Information for you");
        info.setHeaderText("Período em dias");
        info.setContentText("Período calculado: 2");
        info.showAndWait();
    }
    
}
