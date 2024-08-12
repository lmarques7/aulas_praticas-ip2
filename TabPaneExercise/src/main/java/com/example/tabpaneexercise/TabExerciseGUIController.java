package com.example.tabpaneexercise;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TabExerciseGUIController {

    @FXML
    private TextField txtFieldNome;

    @FXML
    private TextField txtFieldEndereco;

    @FXML
    private TextField txtFieldResumo;

    @FXML
    private TextArea txtAreaDescricao;

    @FXML
    private Button btnSubmit;

    @FXML private Button btnCalcular;
    @FXML private DatePicker dtPicker1;
    @FXML private DatePicker dtPicker2;

    public void btnSubmitActionPerformed() {
        System.out.println("botão submit pressionado");

        CasaDeFesta casa = new CasaDeFesta(this.txtFieldNome.getText(),
                this.txtFieldEndereco.getText(), this.txtFieldResumo.getText(),
                this.txtAreaDescricao.getText());

        Alert meuAlertInfo = new Alert(Alert.AlertType.INFORMATION);
        meuAlertInfo.setTitle("Minha informação é:");
        meuAlertInfo.setContentText(casa.toString());
        meuAlertInfo.show();
    }

    public void btnCalcularActionPerfomed() {
        LocalDate data2 = this.dtPicker2.getValue();
        LocalDate data1 = this.dtPicker1.getValue();

        long diferencaEmDias = data1.until(data2, ChronoUnit.DAYS);
        Alert meuAlertInfo = new Alert(Alert.AlertType.INFORMATION);
        meuAlertInfo.setTitle("Minha informação é:");
        meuAlertInfo.setContentText("Dias de diferença: " + diferencaEmDias);
        meuAlertInfo.show();
    }


}
