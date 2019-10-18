

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ActionEventSampleApp extends Application implements EventHandler<ActionEvent> {
    
    private DatePicker dtpicker = new DatePicker();
    Button b = new Button("Clique-me");
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setWidth(720);
        primaryStage.setHeight(480);
//        primaryStage.setOnCloseRequest(this);
        
        Pane p = new Pane();
        b.setLayoutX(100);
        b.setLayoutY(50);
        b.setOnAction(this);
        
        this.dtpicker.setLayoutX(100);
        this.dtpicker.setLayoutY(10);
        p.getChildren().addAll(b, this.dtpicker);
        
        Scene s = new Scene(p);
        primaryStage.setScene(s);
        
        primaryStage.setTitle("Meu exemplo de tela com tratador de eventos de ação");
        primaryStage.show();
    }
    
//    @Override
//    public void handle(WindowEvent event) {
//        System.out.println("Evento de tela para fechar app");
//        System.exit(0);
//    }
    
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource().equals(this.b)) {
            System.out.println("Botão pressionado");
            if (this.dtpicker.getValue() != null) {
                System.out.println(this.dtpicker.getValue());
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        launch();
    }

}
