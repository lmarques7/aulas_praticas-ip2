import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ActionController {
    
    @FXML
    private TextField from;
    
    @FXML
    private TextField to;

    @FXML
    public void botaoPressionado(ActionEvent e) {
        System.out.println("botão pressionado");
        to.setText(from.getText());
    }
    
}
