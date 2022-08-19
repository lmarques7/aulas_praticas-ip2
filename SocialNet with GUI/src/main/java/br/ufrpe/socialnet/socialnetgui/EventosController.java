package br.ufrpe.socialnet.socialnetgui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EventosController {

    @FXML
    DatePicker dtPickerOrigem;

    @FXML
    DatePicker dtPickerDestino;

    @FXML
    Button btnPeriodo;

    @FXML
    TextField txtFieldNome;

    @FXML
    TextField txtFieldPreco;

    @FXML
    public void btnPeriodoPressionado() {
        int days = this.dtPickerOrigem.getValue().until(this.dtPickerDestino.getValue()).getDays();
        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("Cálculo de diferença executado");
        info.setContentText("Diferença em dias é igual a: " + days);
        info.show();
    }

    @FXML
    public void btnMouseEntrou() {
        System.out.println("mouse passou por cima do botão");
    }

    @FXML
    public void btnCapturarObjetoPressionado () {
        String nome = this.txtFieldNome.getText();
        float preco = Float.parseFloat(this.txtFieldPreco.getText());
        Produto p = new Produto(nome, preco);
        System.out.println(p);
    }
}
