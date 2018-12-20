import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorldInClassNoTool extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Minha primeira tela");
        
        Button b1 = new Button("Botão OK");
        b1.setLayoutX(130);
        b1.setLayoutY(60);
        
        Label l1 = new Label ("Label do botão");
        l1.setLayoutX(30);
        l1.setLayoutY(60);
        
        BorderPane myPane = new BorderPane();
//        Pane p2 = new Pane();
        
        myPane.setRight(l1);
        myPane.setCenter(b1);
        
//        p2.getChildren().add(b1);
//        p2.getChildren().add(l1);
        
        Pane p = FXMLLoader.load(getClass().getResource(
                "/br/ufrpe/gui/jfx_samples/2button.fxml"));
        Scene scene = new Scene(p);
        
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(scene);
        
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        
        primaryStage.show();
    }

}
