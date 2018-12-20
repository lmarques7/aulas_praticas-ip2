import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TratadorDeEventosSimples extends Application implements EventHandler<ActionEvent> {
    
    Button button1 = new Button("button1");
    Button button2 = new Button("button2");
    Label label = new Label("nada");

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bPane = new BorderPane();
        bPane.setOnKeyPressed(e -> handle(e));
        
//        button1.setOnAction(this);
        button2.setOnAction(this);
        
        button1.setOnAction(this);
        
        bPane.setCenter(button1);
        bPane.setLeft(button2);
        bPane.setBottom(this.label);
        
        Scene scene = new Scene(bPane, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exemplo de eventos");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.SPACE) {
            System.out.println("Apertei a tecla de espaço");
        }
        System.out.println(event);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource().equals(button1)) {
            System.out.println("botão 1 pressionado");
        } else if (event.getSource().equals(button2)) {
            System.out.println("botão 2 pressionado");
        }
        
    }

}
