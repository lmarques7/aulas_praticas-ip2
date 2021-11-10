package br.ufrpe.academico.models;

import java.time.LocalDate;

public class Professor extends Pessoa {
 
    private String titulacaoMaxima;

    public Professor(String nome, String telefone, String endereco,
            LocalDate dataNascimento, String titulacaoMaxima) {
        super(nome, telefone, endereco, dataNascimento);
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

}
