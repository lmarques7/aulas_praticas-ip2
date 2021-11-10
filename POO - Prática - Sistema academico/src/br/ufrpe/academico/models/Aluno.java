package br.ufrpe.academico.models;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private long matricula;
    private Curso curso;
    private Turma turma;

    public Aluno(String nome, String telefone, String endereco,
            LocalDate dataNascimento, long matricula, Curso curso,
            Turma turma) {
        super(nome, telefone, endereco, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
