import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorldFXJavaPuro extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane painel = new Pane();
        
        Button b = new Button();
        b.setText("Hello World");
        
        painel.getChildren().add(b);
        
        painel.setPrefSize(640, 480);
        Scene s = new Scene(painel);
        
        primaryStage.setScene(s);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
