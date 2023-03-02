package br.ufrpe.filmes.negocio;

import br.ufrpe.filmes.dados.ElementoJaExisteException;
import br.ufrpe.filmes.dados.ElementoNaoExisteException;
import br.ufrpe.filmes.dados.IRepositorioGenerico;
import br.ufrpe.filmes.dados.RepositorioGenerico;
import br.ufrpe.filmes.models.Filme;

import java.util.List;

public class ControladorFilmes {

    private IRepositorioGenerico<Filme> repositorioFilmes;
    private static ControladorFilmes instance;

    private ControladorFilmes() {
        // Construtor privado para implementação de Singleton
        this.repositorioFilmes = new RepositorioGenerico<>("filmes.dat");
    }

    public static ControladorFilmes getInstance() {
        if (instance == null) {
            instance = new ControladorFilmes();
        }
        return instance;
    }

    public void inserirFilme(Filme novoObj) throws ElementoJaExisteException {
        repositorioFilmes.inserir(novoObj);
    }

    public List<Filme> listarFilmes() {
        return repositorioFilmes.listar();
    }

    public void removerFilme(Filme obj) throws ElementoNaoExisteException {
        repositorioFilmes.remover(obj);
    }

    public void atualizarFilme(Filme newObj) throws ElementoNaoExisteException {
        repositorioFilmes.atualizar(newObj);
    }
}
