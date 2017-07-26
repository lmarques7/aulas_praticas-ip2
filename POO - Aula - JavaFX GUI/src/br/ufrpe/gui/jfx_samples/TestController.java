package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class TestController {
    
    @FXML
    private Button okButton;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    public void botaoClicado(ActionEvent event) {
        ScreenManager.getInstance().showFormScreen();
    }
    
    @FXML
    public void cancelAction(ActionEvent aa) {
        // TODO 
    }
}
