package br.ufrpe.sistema_bancario.model;


public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String numero) {
        super(numero, 0.0);
        this.limite = 100.0;
    }

    public void aumentarLimite(double aumento) {
        this.limite += aumento;
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public void debitar(double valor) {
        if (valor < this.saldo + this.limite) {
            this.saldo = this.saldo - valor;
        }
    }

    public void calcularJuros() {
        if (this.saldo < 0) {
            // Calculando o valor absoluto dos juros, pois, se um débito de um 
            // valor negativo for executado, torna-se-á um crédito
            double juros = Math.abs(this.saldo * 0.05);
            this.debitar(juros);
        }
    }

    public static void main(String[] args) {
        Conta contae = new ContaEspecial("2134-5");
        
        contae.creditar(500.0);
        contae.debitar(550.0);
        ((ContaEspecial) contae).aumentarLimite(100.0);
        contae.debitar(75.0);
        ((ContaEspecial) contae).calcularJuros();
        System.out.println(contae.getSaldo());
        
        Conta c = new Conta("1239-7", 55.0);
        System.out.println(c.getClass());
        System.out.println(contae.getClass());
        
    }
}