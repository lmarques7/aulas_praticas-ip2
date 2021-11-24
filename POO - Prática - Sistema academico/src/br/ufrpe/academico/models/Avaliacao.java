package br.ufrpe.academico.models;

import java.time.LocalDateTime;

public class Avaliacao {

    private Aluno alunoRealizador;
    private LocalDateTime dataHoraRealizacao;
    private Turma turma;
    private double nota;

    // TODO (10pts) Crie uma enumeração para representar melhor a categoria de uma nota
    private String categoriaNota; // representando a categoria como 1a/2a/3a VA

    public Aluno getAlunoRealizador() {
        return alunoRealizador;
    }

    public void setAlunoRealizador(Aluno alunoRealizador) {
        this.alunoRealizador = alunoRealizador;
    }

    public LocalDateTime getDataHoraRealizacao() {
        return dataHoraRealizacao;
    }

    public void setDataHoraRealizacao(LocalDateTime dataHoraRealizacao) {
        this.dataHoraRealizacao = dataHoraRealizacao;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getCategoriaNota() {
        return categoriaNota;
    }

    public void setCategoriaNota(String categoriaNota) {
        this.categoriaNota = categoriaNota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
