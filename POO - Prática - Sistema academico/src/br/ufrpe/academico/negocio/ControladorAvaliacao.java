package br.ufrpe.academico.negocio;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrpe.academico.dados.RepositorioGenerico;
import br.ufrpe.academico.models.Aluno;
import br.ufrpe.academico.models.Avaliacao;

public class ControladorAvaliacao {
    
    private RepositorioGenerico<Avaliacao> repositorioAvaliacoes;
    
    private static ControladorAvaliacao instance;

    private ControladorAvaliacao() {
        this.repositorioAvaliacoes = new RepositorioGenerico<Avaliacao>("avaliacoes.dat");
    }
    
    public static ControladorAvaliacao getInstance() {
        if (instance == null) {
            instance = new ControladorAvaliacao();
        }
        return instance;
    }

    public List<Avaliacao> gerarHistoricoEscolar(Aluno aluno, 
            LocalDateTime dataInicial, LocalDateTime dataFinal) {
        // TODO Alterar tipo de retorno para ser um objeto que representa o histório escolar de um aluno
        // Você deverá criar uma classe que represente o histórico escolar do 
        // aluno com todas as avaliações que ele realizou dentro do período de
        // datas inicial e final informados como parâmetro. A classe criada também
        // deverá apresentar uma forma de calcular a média geral do aluno com 
        // base nas suas avaliações realizadas.
        
        // Utilize o repositorioAvaliacoes para acessar todas as avaliações necessárias
        return null;
    }
}
