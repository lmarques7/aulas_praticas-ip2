package br.ufrpe.gui.jfx_samples;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ScreenManager {
    
    private static ScreenManager instance;
    private Stage mainStage;
    
    private Scene testScene;
    private Scene formScene;
    
    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager();
        } 
        
        return instance; 
    }
    
    private ScreenManager() {
        // Construtor privado para evitar instanciação
        
        try {
            BorderPane testPane = FXMLLoader.load(getClass().getResource(
              "/br/ufrpe/gui/jfx_samples/TestScreen.fxml"));
            // inicializando cena
            this.testScene = new Scene(testPane);
            
            BorderPane formPane = FXMLLoader.load(getClass().getResource(
                    "/br/ufrpe/gui/jfx_samples/FormScreen.fxml"));
            // inicializando cena
            this.formScene = new Scene(formPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
        
        // configurando largura e altura do stage.
        mainStage.setWidth(1024);
        mainStage.setHeight(768);

        // configurando título da app
        mainStage.setTitle("Transições entre telas");
    }
    
    public void showTestScreen() {
        this.mainStage.setScene(this.testScene);
        this.mainStage.show();
    }
    
    public void showFormScreen() {
        this.mainStage.setScene(this.formScene);
        this.mainStage.show();
    }
}
