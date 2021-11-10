package br.ufrpe.academico.models;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String telefone, String endereco,
            LocalDate dataNascimento) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}