package br.ufrpe.gui.jfx_samples;

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {        
      ScreenManager.getInstance().setMainStage(primaryStage);
      ScreenManager.getInstance().showTestScreen();
    }

    public static void main(String[] args) {
       launch(args);
    }

}
