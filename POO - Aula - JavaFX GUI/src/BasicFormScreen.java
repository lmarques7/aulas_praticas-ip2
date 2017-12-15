import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BasicFormScreen extends Application {
    
    private HBox hbox;
    private VBox vbox;
    
    private BorderPane mainPanel;
    private Pane centralPanel;
    
    private Button btnCadastrar;
    private Button btnRemover;
    private Button btnOK;
    private Button btnCancelar;
    
    private TextField txtFldNome;
    private TextField txtFldLogin;
    private PasswordField txtFldSenha;
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.hbox = new HBox();
        this.vbox = new VBox();
        
        this.mainPanel = new BorderPane();
        this.centralPanel = new Pane();
        
        this.mainPanel.setLeft(this.vbox);
        this.mainPanel.setCenter(this.centralPanel);
        this.mainPanel.setBottom(this.hbox);
        
        this.btnCadastrar = new Button("Cadastrar");
        this.btnRemover = new Button("Remover");
        this.btnOK = new Button("OK");
        this.btnCancelar = new Button("Cancelar");
        
        this.btnOK.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Do bot„o azul");
                alert.setContentText("BOT„O AZUL com inner class");
                alert.showAndWait();
            }
        });
        
        this.txtFldNome = new TextField("Nome");
        this.txtFldNome.setPrefWidth(200);
        
        this.txtFldLogin = new TextField("Login");
        this.txtFldLogin.setPrefWidth(200);
        
        this.txtFldSenha = new PasswordField();
        this.txtFldSenha.setPrefWidth(200);
        
        this.vbox.getChildren().addAll(this.btnCadastrar, this.btnRemover);
        
        this.hbox.getChildren().addAll(this.btnOK, this.btnCancelar);
        this.hbox.setAlignment(Pos.CENTER_RIGHT);
        
        this.txtFldLogin.setLayoutX(20);
        this.txtFldLogin.setLayoutY(20);
        
        this.txtFldNome.setLayoutX(20);
        this.txtFldNome.setLayoutY(60);
        
        this.txtFldSenha.setLayoutX(20);
        this.txtFldSenha.setLayoutY(100);
        
        this.centralPanel.getChildren().addAll(this.txtFldLogin, this.txtFldNome, this.txtFldSenha);
        
        Scene scene = new Scene(this.mainPanel);
        primaryStage.setScene(scene);
        
        primaryStage.setWidth(1024);
        primaryStage.setWidth(768);
        primaryStage.setTitle("Meu formul·rio de cadastro");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
