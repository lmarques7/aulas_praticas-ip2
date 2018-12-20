
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldEmSala extends Application {

    private Button button;
    private Button azul;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.setWidth(640);
        mainStage.setHeight(480);

        AnchorPane pane = new AnchorPane();
        
        azul = new Button("Blue");
        azul.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Do bot„o azul");
                alert.setContentText("BOT„O AZUL com inner class");
                alert.showAndWait();
            }
        });

        Text label = new Text("Oi pessoal");
        Font myFont = Font.font("Calvin", FontWeight.BOLD, 80);

        InnerShadow is = new InnerShadow();
        is.setOffsetX(4.0f);
        is.setOffsetY(4.0f);

        label.setFont(myFont);
        label.setEffect(is);
        label.setFill(Color.BLUEVIOLET);
        Insets padding = new Insets(50, 200, 0, 0);

        button = new Button("Ok button");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Mensagem qualquer");
                alert.setContentText("Meu texto do alert com inner class");
                alert.showAndWait();
            }
        });

        pane.setPadding(padding);
        pane.getChildren().addAll(label, button, azul);

        AnchorPane.setLeftAnchor(label, Double.valueOf(50));
        AnchorPane.setTopAnchor(label, Double.valueOf(50));
        AnchorPane.setLeftAnchor(button, Double.valueOf(50));
        AnchorPane.setTopAnchor(button, Double.valueOf(150));

        AnchorPane.setLeftAnchor(azul, Double.valueOf(250));
        AnchorPane.setTopAnchor(azul, Double.valueOf(350));

        Scene mainScene = new Scene(pane);

        mainStage.setScene(mainScene);
        mainStage.setTitle("Meu primeiro app");
        mainStage.show();
    }

}
