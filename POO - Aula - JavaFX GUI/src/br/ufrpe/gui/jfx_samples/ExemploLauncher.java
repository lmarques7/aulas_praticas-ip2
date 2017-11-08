package br.ufrpe.gui.jfx_samples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ExemploLauncher extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane testPane = FXMLLoader.load(getClass().getResource(
                "/br/ufrpe/gui/jfx_samples/Exemplo.fxml"));
        // inicializando cena
        
        Scene scene = new Scene(testPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
