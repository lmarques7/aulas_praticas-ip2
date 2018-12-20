package event_listeners;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;

public class DateGuiController {
    
    @FXML private DatePicker data1;
    @FXML private DatePicker data2;
    
    @FXML
    public void botaoPressionado(ActionEvent event) {
        LocalDate dt1 = data1.getValue();
        LocalDate dt2 = data2.getValue();
        
        long dif = dt1.until(dt2, ChronoUnit.DAYS);
        Alert a = new Alert(AlertType.WARNING);
        a.setContentText("Diferença em dias é: " + dif);
        a.show();
    }

}
