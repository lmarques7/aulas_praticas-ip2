package event_listeners;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaPuroListenerExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(640);
        primaryStage.setHeight(480);
        
        Pane p = new Pane();
        Button b = new Button("Apresentar");
        b.setLayoutX(20);
        b.setLayoutY(20);
        
        b.setPrefSize(200, 50);
        
//        b.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                Alert a = new Alert(AlertType.INFORMATION);
//                a.setContentText("Meu botão foi pressionado");
//                a.show();
//            }
//            
//        });
        
        b.setOnAction(x -> {
            Alert a = new Alert(AlertType.INFORMATION);
            a.setContentText("Meu botão foi pressionado");
            a.show();
        });
        
        p.getChildren().add(b);
        
        Scene s = new Scene(p);
        primaryStage.setScene(s);
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
