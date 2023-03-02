package br.ufrpe.academico.models;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import br.ufrpe.academico.models.enums.DiaDaSemana;

public class Turma {
    public static final int CAPACIDADE_MAXIMA = 60;
    private int ano;
    private int semestre;

    // TODO (30pts) Crie uma enumeração para representar melhor os dias da semana
    private List<DiaDaSemana> diasDaSemana;
    private List<LocalTime> horarios;
    private Disciplina disciplina;
    private Set<Aluno> alunos;
    private Professor professorResponsavel;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<DiaDaSemana> getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(List<DiaDaSemana> diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public List<LocalTime> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<LocalTime> horarios) {
        this.horarios = horarios;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turma other = (Turma) obj;
        if (ano != other.ano)
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        if (semestre != other.semestre)
            return false;
        return true;
    }
    
    

}
