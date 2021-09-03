
public class Conta {

    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String toString() {
        String resultado = "Número da conta: " + this.numero;
        resultado = resultado + "\n" + this.saldo;
        return resultado;
    }

    public static void main(String[] args) {
        Conta c1 = new Conta("1234-5", 300.50);
        System.out.println( c1 );
    } 

}
