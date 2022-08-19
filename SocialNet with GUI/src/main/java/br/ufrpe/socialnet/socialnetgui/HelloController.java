package br.ufrpe.socialnet.socialnetgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label meuLabel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void meuBotaoApertado() {
        this.meuLabel.setText("botão pressionado");
    }
}