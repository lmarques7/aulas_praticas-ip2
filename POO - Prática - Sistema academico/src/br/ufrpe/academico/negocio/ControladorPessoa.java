package br.ufrpe.academico.negocio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.academico.dados.RepositorioGenerico;
import br.ufrpe.academico.exceptions.AlunoMenorDeIdadeException;
import br.ufrpe.academico.exceptions.ElementoJaExisteException;
import br.ufrpe.academico.models.Aluno;
import br.ufrpe.academico.models.Pessoa;

public class ControladorPessoa {
    
    private RepositorioGenerico<Pessoa> repositorioPessoas;
    
    private static ControladorPessoa instance;

    private ControladorPessoa() {
        this.repositorioPessoas = new RepositorioGenerico<>("pessoas.dat");
    }
    
    public static ControladorPessoa getInstance() {
        if (instance == null) {
            instance = new ControladorPessoa();
        }
        return instance;
    }
    
    private boolean ehMaiorDeIdade(LocalDate dataNascimento) {
        return dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS) >= 18;
    }
    
    public void realizarCadastroAluno(Aluno a) 
            throws AlunoMenorDeIdadeException, ElementoJaExisteException {
        // TODO (60pts) Cadastrar aluno no repositório de pessoas
        if (!ehMaiorDeIdade(a.getDataNascimento())) {
            throw new AlunoMenorDeIdadeException(a);
        }
        
        this.repositorioPessoas.inserir(a);
        // O aluno só pode ser cadastrado se for maior de idade na data corrente
        // do momento da execução do método. Use o repositorioPessoas para salvar 
        // o objeto Aluno.
        // Se um aluno for menor de idade, uma exceção devera ser criada e levantada
        // neste método. A assinatura do método precisará ser alterada
    }
    
    public List<Aluno> buscarAlunosComTelefoneIniciandoCom(String ddd) {
        // TODO (60pts) Listar alunos (somente alunos) cujo telefone se iniciam com o ddd informado como parâmetro
        // Observe que você não deve retornar instâncias de professores com este
        // DDD, mas somente alunos. Use o repositorioPessoas para buscar informações.
        List<Aluno> resultado = new ArrayList<>();
        
        for (Pessoa p : this.repositorioPessoas.listar()) {
            if (p instanceof Aluno) {
                Aluno a = ((Aluno) p);
                
                if (a.getTelefone().startsWith(ddd)) {
                    resultado.add(a);
                }
            }
        }
        
        return resultado;
    }

}
