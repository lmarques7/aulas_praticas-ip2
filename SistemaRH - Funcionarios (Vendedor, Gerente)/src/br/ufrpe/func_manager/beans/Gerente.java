package br.ufrpe.func_manager.beans;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    
    private String departamento;
    
    public Gerente() {
        this.departamento = "";
    }

    public Gerente(String departamento) {
        super();
        this.departamento = departamento;
    }
    
    public Gerente(int codigo, String nome, double salario, LocalDate dataAdmissao, 
            String departamento) {
        super(codigo, nome, salario, dataAdmissao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
