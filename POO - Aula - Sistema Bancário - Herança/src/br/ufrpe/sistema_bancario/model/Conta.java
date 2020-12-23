package br.ufrpe.sistema_bancario.model;

import java.time.LocalDate;

public class Conta {

	private String numero;
	protected double saldo;
	
	public Conta(String numero, double saldo){
		this.setNumero(numero);
		this.setSaldo(saldo);
	}
	
	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	private void setNumero(String numero) {
		if (numero != null) {
			this.numero = numero;	
		} else {
			// Possivel exceção a ser levantada
		}
	}

	private void setSaldo(double saldo) {
		if (saldo >= 0.0) {
			this.saldo = saldo;	
		}else{
		  // Possivel exceção a ser levantada
		}
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
	
    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if (obj instanceof Conta) {
            Conta param = (Conta) obj;
            // Não considera se ambos os objetos têm valores nulos de atributos
            if (param.getNumero() != null 
                    && param.getNumero().equals(this.getNumero()) 
                    && param.getSaldo() == this.getSaldo()) {
                resultado = true;
            }
        }
        return resultado;        
    }
	
	public static void main(String[] args) {
	  Conta c1 = new Conta("456789-95", 154657867);
	  LocalDate lc = LocalDate.now();
	  c1.equals(lc); 
	  // Posso executar linha acima por causa da assinatura de equals que recebe Object
	  
	  String texto = c1.toString();
	  System.out.println(texto);
	  System.out.println(c1); // Mesmo resultado da linha acima
  }
}
