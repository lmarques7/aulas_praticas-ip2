package br.ufrpe.academico.models;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private long matricula;
    private Curso curso;

    public Aluno(String nome, String telefone, String endereco,
            LocalDate dataNascimento, long matricula, Curso curso) {
        super(nome, telefone, endereco, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
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

}
