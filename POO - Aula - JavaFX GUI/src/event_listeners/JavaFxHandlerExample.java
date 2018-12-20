package event_listeners;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class JavaFxHandlerExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        TabPane tp = FXMLLoader
                .load(getClass().getResource("/event_listeners/DateGui.fxml"));

        Scene s = new Scene(tp);
        primaryStage.setWidth(640);
        primaryStage.setHeight(480);
        
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
