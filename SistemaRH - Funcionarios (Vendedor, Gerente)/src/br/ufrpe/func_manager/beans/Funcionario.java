package br.ufrpe.func_manager.beans;

import java.time.LocalDate;

public class Funcionario {

    private int codigo;
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario() {
        this.nome = "";
    }

    public Funcionario(int codigo, String nome, double salario, LocalDate dataAdmissao) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setSalario(salario);
        this.dataAdmissao = dataAdmissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
