package br.ufrpe.academico.negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.academico.dados.RepositorioGenerico;
import br.ufrpe.academico.exceptions.ElementoJaExisteException;
import br.ufrpe.academico.models.Aluno;
import br.ufrpe.academico.models.Curso;
import br.ufrpe.academico.models.Disciplina;
import br.ufrpe.academico.models.Professor;
import br.ufrpe.academico.models.Turma;
import br.ufrpe.academico.models.enums.DiaDaSemana;

public class ControladorCursoDisciplinaTurma {
    
    private RepositorioGenerico<Curso> repositorioCurso;
    private RepositorioGenerico<Disciplina> repositorioDisciplina;
    private RepositorioGenerico<Turma> repositorioTurma;
    
    private static ControladorCursoDisciplinaTurma instance;

    private ControladorCursoDisciplinaTurma() {
        this.repositorioCurso = new RepositorioGenerico<>("cursos.dat");
        this.repositorioDisciplina = new RepositorioGenerico<>("disciplinas.dat");
        this.repositorioTurma = new RepositorioGenerico<>("turmas.dat");
    }
    
    public static ControladorCursoDisciplinaTurma getInstance() {
        if (instance == null) {
            instance = new ControladorCursoDisciplinaTurma();
        }
        return instance;
    }

    public void abrirTurmaAnoCorrente(Professor p, Disciplina d, int semestre) 
            throws ElementoJaExisteException {
        // TODO (100pts) Abrir uma turma da discilina, professor e semestre informados como parâmetro
        // Instanciar uma Turma com base na disciplina, professor e semestre informados. 
        // Usar nessa instância o ano corrente no momento da execução do método.
        // Usar dias da semana e horários à sua escolha.
        Turma novaTurma = new Turma();
        novaTurma.setDisciplina(d);
        novaTurma.setProfessorResponsavel(p);
        novaTurma.setSemestre(semestre);
        novaTurma.setAno(LocalDate.now().getYear());
        
        List<DiaDaSemana> diasDaSemana = new ArrayList<>();
        diasDaSemana.add(DiaDaSemana.SEGUNDA);
        diasDaSemana.add(DiaDaSemana.QUINTA);
                
        novaTurma.setDiasDaSemana(diasDaSemana);
        
        List<LocalTime> horarios = new ArrayList<>();
        horarios.add(LocalTime.NOON);
        
        novaTurma.setHorarios(horarios);
        
        // OBS: Uma nova turma não poderá ser aberta se já houver três outras turmas 
        // no mesmo ano/semestre para a disciplina informada como parâmetro.
        
        List<Turma> todasAsTurmas = this.repositorioTurma.listar();
        int contador = 0;
        
        for (Turma turmaCorrente : todasAsTurmas) {
            if (turmaCorrente.equals(novaTurma)) {
                contador ++;
            }
        }
        
        if (contador < 3) {
            this.repositorioTurma.inserir(novaTurma);
        }
        
        // Se necessário, implemente métodos equals nas classes básicas (models)
        // Para consultar outras turmas, use o repositorioTurma desta classe 
    }
    
    public List<Turma> buscarTurmasComPoucosAlunos() {
        // TODO (100pts) Implementar método para filtrar turmas com menos da metade da capacidade máxima de alunos
        // - Considere que turmas já foram criadas e já tiveram alunos matriculados
        // - As turmas são acessíveis através do respositorioTurma
        // - Use a constante CAPACIDADE_MAXIMA da classe Turma
        return null;
    }
    
    public List<Curso> buscarCursosComCoordenadorIgualA(Professor coordenador) {
        // TODO (20pts) Implementar método para buscar Cursos cujo coordenador é informado como parâmetro
        // - Considere que cursos já foram criados e armazenados no repositório
        // - Os cursos são acessíveis através do repositorioCursos
        return null;
    }
    
    public void matricularAlunoEmTurmaDaDisciplina(Aluno aluno, Disciplina disciplina) 
            throws ElementoJaExisteException {
        // TODO (120pts) Realizar a matrícula do aluno em alguma turma da disciplina informada
        // Este método deve buscar por turmas que tenham poucos alunos matriculados
        // usando o método 'buscarTurmasComPoucosAlunos' 
        
        List<Turma> turmaComPoucosAlunos = this.buscarTurmasComPoucosAlunos();
        
        
        // e então ver se há turmas
        // ofertadas com a disciplina entregue como parâmetro 
        
        List<Turma> turmasFiltradasPorDisciplina = new ArrayList<>();
        for (Turma t : turmaComPoucosAlunos) {
            if (t.getDisciplina().equals(disciplina)) {
                turmasFiltradasPorDisciplina.add(t);
            }
        }
        
        // e só então realizar
        // a matrícula do aluno. A matrícula será feita simplesmente adicionando 
        // elemento do tipo Aluno na turma encontrada COM MENOR NÚMERO DE ALUNOS
        
        turmasFiltradasPorDisciplina.sort((k,v) -> k.getAlunos().size() - v.getAlunos().size());
        
        Turma turmaEncontrandoParaMatricula = turmasFiltradasPorDisciplina.get(0);
        
        if (turmaEncontrandoParaMatricula.getAlunos().contains(aluno)) {
            throw new ElementoJaExisteException(aluno);
        } 

        turmaEncontrandoParaMatricula.getAlunos().add(aluno);
        
        
        // Há uma situação excepcional se uma matrícula de um dado aluno tentar 
        // ser feita mais de uma vez para uma mesma disciplina. Nesse caso, uma 
        // exceção deverá ser levantada representando tal ocorrência. A assinatura
        // deste método então deve ser alterada para listar a exceção e a classe 
        // que representa a exceção também deverá ser criada
        
    }
}
