package br.ufrpe.filmes;

import br.ufrpe.filmes.dados.ElementoJaExisteException;
import br.ufrpe.filmes.models.Filme;
import br.ufrpe.filmes.negocio.ControladorFilmes;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    static final Filme[] FILMES = {
            new Filme(77, "Eu e todos", "Era uma vez um filme muito legal", 7.99F),
            new Filme(17, "Baleia azul", "Havia uma baleia no mar", 3.46F),
            new Filme(327, "Lagoa azul", "Dois adolecentes numa ilha", 9.97F)
    };

    @Override
    public void start(Stage stage) throws IOException, ElementoJaExisteException {
        for (Filme f: FILMES) {
            ControladorFilmes.getInstance().inserirFilme(f);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("listaFilmes.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Lista de filmes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}