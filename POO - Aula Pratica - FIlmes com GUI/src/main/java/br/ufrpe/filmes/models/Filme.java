package br.ufrpe.filmes.models;

import java.io.Serializable;

public class Filme implements Serializable {

    private long id;
    private String nome;
    private String sinopse;
    private float nota;

    public Filme() {
    }

    public Filme(long id, String nome, String sinopse, float nota) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.nota = nota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
