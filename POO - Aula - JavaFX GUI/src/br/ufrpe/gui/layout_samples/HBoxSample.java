package br.ufrpe.gui.layout_samples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxSample extends Application {

  @Override
  public void start(Stage stage) {

    initUI(stage);
  }

  private void initUI(Stage stage) {

    HBox root = new HBox(5);
    root.setPadding(new Insets(10));
    root.setAlignment(Pos.BASELINE_RIGHT);

    Button prevBtn = new Button("Previous");
    Button nextBtn = new Button("Next");
    Button cancBtn = new Button("Cancel");
    Button helpBtn = new Button("Help");

    root.getChildren().addAll(prevBtn, nextBtn, cancBtn, helpBtn);

    Scene scene = new Scene(root);
    stage.setTitle("Row of buttons");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}