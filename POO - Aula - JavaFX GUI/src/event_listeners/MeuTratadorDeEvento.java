package event_listeners;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MeuTratadorDeEvento implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Alert a = new Alert(AlertType.INFORMATION);
        a.setContentText("Meu botão foi pressionado");
        a.show();
    }
}
