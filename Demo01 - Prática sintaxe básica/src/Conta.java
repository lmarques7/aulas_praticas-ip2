public class Conta {

    private String numero;
    private double saldo;
    private Cliente clienteDono;

    public Conta(String numeroInicial, double saldoInicial) {
        this.numero = numeroInicial;
        this.saldo = saldoInicial;
    }

    public Conta(String numeroInicial) {
        numero = numeroInicial;
        saldo = 0;
    }

    public Conta(String numeroInicial, double saldoInicial, Cliente clienteDono) {
        this.numero = numeroInicial;
        this.saldo = saldoInicial;
        this.clienteDono = clienteDono;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void creditar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public boolean equals(Object c) {
        Conta outra = (Conta) c;
        boolean resultado = false;
        if (outra != null && this.saldo == outra.getSaldo()
                && this.numero != null
                && this.numero.equals(outra.getNumero())) {
            resultado = true;
        }
        return resultado;
    }

    public String toString() {
        String resultado = "";
        resultado += "---------------------------\n";
        resultado += this.numero + "\n";
        resultado += this.saldo + "\n";
        resultado += "---------------------------\n";
        return resultado;
    }

}
