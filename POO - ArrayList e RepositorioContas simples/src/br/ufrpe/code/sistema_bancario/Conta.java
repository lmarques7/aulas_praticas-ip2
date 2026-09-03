package br.ufrpe.code.sistema_bancario;
public class Conta {

    // Pode ser 'final' se o número não é alterado depois que a conta é instanciada
    private final String numero;
    private double saldo;

    public Conta() { // construtor default
        // Gerando número aleatório da conta, como uma string de caracteres aleatórios com 6 dígitos
        // Exemplo de saída: "4f3b89"
        numero = java.util.UUID.randomUUID().toString().substring(0, 6);
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
            // Lugar do sysout dentro de classe básica (model) não é adequado e será melhorado nas próximas aulas
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