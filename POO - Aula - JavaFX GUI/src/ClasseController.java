import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ClasseController {
    
    @FXML
    private DatePicker dtPicker;

    @FXML
    public void botaoDtPickerPressionado(ActionEvent event) {
        System.out.println("Método");
        System.out.println(dtPicker.getValue());
        if (dtPicker.getValue() != null) {
            Alert info = new Alert(AlertType.INFORMATION);
            info.setTitle("Informação");
            info.setContentText(this.dtPicker.getValue().toString());
            info.show();
        }
    }
    
}
