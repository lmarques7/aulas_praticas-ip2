package br.ufrpe.gui.jfx_samples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BasicFormComSceneBuilder extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        BorderPane testPane = FXMLLoader.load(getClass()
                .getResource("/br/ufrpe/gui/jfx_samples/FormComSceneBuilder.fxml"));
        
        Scene scene = new Scene(testPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
