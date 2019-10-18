import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorldJavaFXML extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = FXMLLoader.load(getClass().getResource("action.fxml"));
        Scene scene = new Scene(p);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
