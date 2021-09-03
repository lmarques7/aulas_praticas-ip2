package br.ufrpe.sistema_bancario;

import java.time.LocalDateTime;

public class ContaComGerador {

    private String numero;
    private double saldo;
    private static int proxima = 1;
    
    public ContaComGerador(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        proxima = proxima + 1;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void creditar (double valor) {
      // Um crédito negativo seria um débito
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
          // Possível exceção a ser levantada       
        }
    }
    
    public void debitar (double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
          // Possível exceção a ser levantada
        }
    }
    
    public String toString() {
      String resultado = "************************************\n";
      resultado += String.format("* %16s %15s *\n", "Número da conta:", this.numero);
      resultado += String.format("* %16s %15.2f *\n", "Saldo atual:", this.saldo);
      resultado += "************************************\n";
      return resultado;
    }
    
    public static int getProxima () {
        return proxima;
    }
    
    public static void main(String[] args) {
        ContaComGerador c1 = new ContaComGerador("1234-6", 100.5);
        ContaComGerador c2 = new ContaComGerador("9872-2", 50.5);
        ContaComGerador c3 = new ContaComGerador("9875-8", 777.5);
        
        System.out.println(c1);
        System.out.println(ContaComGerador.getProxima());
        System.out.println(ContaComGerador.getProxima());
        System.out.println(ContaComGerador.getProxima());
        
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime minhaData = LocalDateTime.of(2020, 12, 23, 10, 0, 15);
        
        
    }
}
