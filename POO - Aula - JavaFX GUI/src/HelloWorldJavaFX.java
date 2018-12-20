import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application {
    
    @FXML
    private Button btnCancel;
    
    @FXML
    private Button btnOk;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(640);
        primaryStage.setHeight(480);
//        Pane p = new Pane();
//        
//        Label l = new Label("Hello world");
//        l.setLayoutX(50);
//        l.setLayoutY(200);
//        
//        p.getChildren().add(l);
        
        BorderPane p = FXMLLoader.load(getClass().getResource(
                "/br/ufrpe/gui/jfx_samples/MeuHW.fxml"));
        Scene scene = new Scene(p);
        
        primaryStage.setTitle("Meu hello world java fx");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
    @FXML
    public void botaoOkPressionado(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION, "Este é um alert gerado em código");
        alert.setTitle("Maior time do mundo é o BRASIL");
        alert.showAndWait();
        // TODO
    }
    
    public static void main(String[] args) {
        launch();
    }
}
