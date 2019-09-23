package br.ufrpe.func_manager.beans;

import java.time.LocalDate;

public class Vendedor extends Funcionario {

    private double percentualComissao;
    
    public Vendedor() {
        super();
        this.percentualComissao = 0;
    }
    
    public Vendedor(int codigo, String nome, double salario, LocalDate dataAdmissao, 
            double percentualComissao) {
        super(codigo, nome, salario, dataAdmissao);
        this.setPercentualComissao(percentualComissao);
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao > 0) {
            this.percentualComissao = percentualComissao;
        }
    }
    
    
    
}
