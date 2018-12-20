package br.ufrpe.gui.jfx_samples;

import java.time.LocalDate;

import beans.Jogador;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class TableViewSample extends Application {
    
    private TableView<Jogador> table = new TableView<>();
    
    private final ObservableList<Jogador> minhaLista =
        FXCollections.observableArrayList(
            new Jogador("Leandro", "lmarques7", LocalDate.now()),
            new Jogador("Maria", "brasilHexa", LocalDate.of(2015, 12, 10)),
            new Jogador("Bruna", "espanha-perde", LocalDate.of(2010, 12, 10)),
            new Jogador("Nada", "franca-ruim", LocalDate.of(1980, 12, 1)),
            new Jogador("Baleia Azul", "melhorBrasil", LocalDate.of(2000, 2, 1))
        );
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Exemplo de Table View");
        stage.setWidth(450);
        stage.setHeight(500);
 
        final Label label = new Label("Jogadores");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
 
        TableColumn<Jogador, String> firstNameCol = new TableColumn<>("Nome");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
 
        TableColumn<Jogador, String> login = new TableColumn<>("Login");
        login.setMinWidth(100);
        login.setCellValueFactory(new PropertyValueFactory<>("login"));
 
        TableColumn<Jogador, LocalDate> dataNascimento = new TableColumn<>("Data Nascimento");
        dataNascimento.setMinWidth(200);
        dataNascimento.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
 
        table.setItems(minhaLista);
        table.getColumns().addAll(firstNameCol, login, dataNascimento);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
