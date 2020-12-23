package br.ufrpe.sistema_bancario.model;


public class Poupanca extends Conta {

    public Poupanca(String numero){
        super(numero, 0.0);
        //código
    }
    
    public void renderJuros(double taxa) {        
        this.creditar(this.getSaldo()*taxa);
    }
    
}
