import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PaneSampleInClass extends Application implements EventHandler<KeyEvent> {

  @Override
  public void start(Stage primaryStage) throws Exception {
    BorderPane mainPane = new BorderPane();
    
    Button b = new Button("OK");
    
    mainPane.setCenter(b);
    mainPane.setOnKeyPressed(e -> keyPressed(e));
    mainPane.addEventHandler(KeyEvent.ANY, this);
    
    Scene mainScene = new Scene(mainPane);
    
    primaryStage.setWidth(640);
    primaryStage.setHeight(480);
    primaryStage.setScene(mainScene);
    primaryStage.setTitle("Pane Sample");
    
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void handle(KeyEvent e) {  
      if (e.getEventType().equals(KeyEvent.KEY_RELEASED)) {
          switch (e.getCode()) {
          case UP:
            System.out.println("CIMA LIBERADO");
            break;
          case DOWN:
            System.out.println("BAIXO LIBERADO");
            break;
          case LEFT:
            System.out.println("ESQUERDA LIBERADO");
            break;
          case RIGHT:
            System.out.println("DIREITA LIBERADO");
            break;
          default:
              break;
          }
      }
  }
  
  public void keyPressed(KeyEvent e) {
    switch (e.getCode()) {
    case UP:
      System.out.println("CIMA PRESSIONADO");
      break;
    case DOWN:
      System.out.println("BAIXO PRESSIONADO");
      break;
    case LEFT:
      System.out.println("ESQUERDA PRESSIONADO");
      break;
    case RIGHT:
      System.out.println("DIREITA PRESSIONADO");
      break;
    default:
        break;
    }
    
  }
  
}
