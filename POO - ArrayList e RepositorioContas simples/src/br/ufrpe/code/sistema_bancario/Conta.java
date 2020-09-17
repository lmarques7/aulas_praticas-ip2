package br.ufrpe.code.sistema_bancario;
public class Conta {

    private String numero;
    private double saldo;

    public Conta() { // construtor default
        numero = "000-0";
        saldo = 0.0;
    }
    
    public Conta(String numeroInicial, double saldoInicial) {
        numero = numeroInicial;
        saldo = saldoInicial;
    }

    public void creditar(double valor) {
        saldo = saldo + valor;
    }

    public void debitar(double valor) {
        if (valor < saldo) {
            saldo = saldo - valor;            
        } else {
            System.out.println("Saldo insuficiente");
        }        
    }
    
    public String getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
}