package br.ufrpe.zoom_killer.models;

import java.time.LocalDate;

public class Usuario {

    private String email;
    private String nome;
    private LocalDate dataNascimento;

    public Usuario(String email, String nome, LocalDate dataNascimento) {
        this.email = email;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
