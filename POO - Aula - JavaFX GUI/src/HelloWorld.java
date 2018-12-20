

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Hello World sem usar a ferramenta SceneBuilder
 * 
 * @author Leandro M. Nascimento
 */
public class HelloWorld extends Application {

  private Button okButton;
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    this.okButton = new Button("That's OK");
    
    InnerShadow is = new InnerShadow();
    is.setOffsetX(4.0f);
    is.setOffsetY(4.0f);
    
    Reflection ref = new Reflection();
    ref.setFraction(0.9f);
    
    Text label = new Text("Olá JavaFX");
    Font font = Font.font("Lucida Handwriting", FontWeight.BOLD, 76);
    label.setFont(font);
    label.setEffect(ref);    
    label.setFill(Color.MEDIUMPURPLE);
    
    primaryStage.setWidth(640);
    primaryStage.setHeight(480);
    primaryStage.setTitle("Hello World");
    
    double w = Screen.getPrimary().getVisualBounds().getWidth();
    double h = Screen.getPrimary().getVisualBounds().getHeight();
    System.out.printf("Screen size (WxH): %f x %f", w, h);
    primaryStage.setX(w/2 - primaryStage.getWidth()/2);
    primaryStage.setY(h/2 - primaryStage.getHeight()/2);
    
    BorderPane pane = new BorderPane();    
    pane.setCenter(label);
    HBox hbox = new HBox();
    hbox.setAlignment(Pos.BASELINE_RIGHT);
    hbox.getChildren().add(this.okButton);
    pane.setBottom(hbox);
    
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }

}
