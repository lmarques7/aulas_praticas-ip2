package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FormScreenController {
    
    @FXML
    public void voltarParaTelaAnterior(ActionEvent event) {
        ScreenManager.getInstance().showTestScreen();
    }

}
