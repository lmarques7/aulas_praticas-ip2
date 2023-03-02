package br.ufrpe.filmes.gui;

import br.ufrpe.filmes.models.Filme;
import br.ufrpe.filmes.negocio.ControladorFilmes;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListaFilmesController {

    @FXML private TableColumn<Filme, Long> columnFilmeId;
    @FXML private TableColumn<Filme, String> columnFilmeNome;
    @FXML private TableColumn<Filme, String> columnFilmeSinopse;
    @FXML private TableColumn<Filme, Float> columnFilmeNota;
    @FXML private TableView<Filme> tblViewFilmes;

    @FXML
    public void initialize() {
        this.columnFilmeId.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.columnFilmeNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        this.columnFilmeSinopse.setCellValueFactory(new PropertyValueFactory<>("sinopse"));
        this.columnFilmeNota.setCellValueFactory(new PropertyValueFactory<>("nota"));

        this.updateFilmes();
    }

    private void updateFilmes() {
        ObservableList<Filme> result = FXCollections.observableArrayList();
        result.addAll(ControladorFilmes.getInstance().listarFilmes());
        this.tblViewFilmes.setItems(result);
    }

    @FXML
    public void btnInserirFilmePressionado() {
        System.out.println("Botão inserir");
    }
}
