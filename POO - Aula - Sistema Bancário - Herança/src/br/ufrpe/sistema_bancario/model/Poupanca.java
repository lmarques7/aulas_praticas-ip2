package br.ufrpe.sistema_bancario.model;

import java.time.LocalDateTime;

public class Poupanca extends Conta {
    
    private int diaRendimento;

    public Poupanca(String numero){
        super(numero, 0.0);
        //código
    }
    
    public void renderJuros(double taxa) {        
        this.creditar(this.getSaldo()*taxa);
    }
    
    public void checarAniversario() {
        LocalDateTime agora = LocalDateTime.now();
        if (diaRendimento == agora.getDayOfMonth()) {
            this.renderJuros(0.05);
        }
    }
    
}
