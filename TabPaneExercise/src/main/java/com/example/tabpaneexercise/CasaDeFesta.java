package com.example.tabpaneexercise;

public class CasaDeFesta {

    private String nome;
    private String endereco;
    private String resumo;
    private String descricao;

    public CasaDeFesta(String nome, String endereco, String resumo, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.resumo = resumo;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "CasaDeFesta{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", resumo='" + resumo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
