package br.ufrpe.gui.jfx_samples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AbasLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane testPane = FXMLLoader.load(getClass().getResource(
                "Abas.fxml"));
        
        // inicializando cena
        Scene abasScene = new Scene(testPane);
        primaryStage.setTitle("Mais um exemplo com abas");
        primaryStage.setScene(abasScene);
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
