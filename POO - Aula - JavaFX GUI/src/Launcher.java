import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Launcher extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = FXMLLoader.load(getClass().getResource(
                "/action-tests.fxml"));
        Scene scene = new Scene(p);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Meu exemplo com FXML");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
