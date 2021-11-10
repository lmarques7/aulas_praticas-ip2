package br.ufrpe.academico.negocio;

import java.util.List;

import br.ufrpe.academico.dados.RepositorioGenerico;
import br.ufrpe.academico.models.Aluno;
import br.ufrpe.academico.models.Pessoa;

public class ControladorPessoa {
    
    private RepositorioGenerico<? extends Pessoa> repositorioPessoas;
    
    private static ControladorPessoa instance;

    private ControladorPessoa() {
        this.repositorioPessoas = new RepositorioGenerico<Pessoa>("pessoas.dat");
    }
    
    public static ControladorPessoa getInstance() {
        if (instance == null) {
            instance = new ControladorPessoa();
        }
        return instance;
    }
    
    public void realizarCadastroAluno() {
        // TODO Cadastrar aluno no repositório de pessoas
        // O aluno só pode ser cadastrador se for maior de idade na data corrente
        // do momento da execução do método. Use o repositorioPessoas para salvar 
        // o objeto Aluno.
        // Se um aluno for menor de idade, uma exceção devera ser criada e levantada
        // neste método. A assinatura do método precisará ser alterada
    }
    
    public List<Aluno> buscarAlunosComTelefoneIniciandoCom(String ddd) {
        // TODO Listar alunos (somente alunos) cujo telefone se iniciam com o ddd informado como parâmetro
        // Observe que você não deve retornar instâncias de professores com este
        // DDD, mas somente alunos. Use o repositorioPessoas para buscar informações.
        return null;
    }

}
