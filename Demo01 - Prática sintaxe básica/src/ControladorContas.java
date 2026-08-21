import javax.crypto.CipherInputStream;

public class ControladorContas {

    public boolean transferir(Conta origem, Conta destino, double valorASerTransferido) {
        boolean resultado = false;
        if (origem != null && destino != null && origem.getSaldo() >= valorASerTransferido) {
            origem.debitar(valorASerTransferido);
            destino.creditar(valorASerTransferido);
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        ControladorContas cc = new ControladorContas();
        Conta contaOrigem = new Conta("4444-8", 200);
        Conta contaDestino = new Conta("5555-9", 50);

        System.out.println(contaOrigem.getSaldo());
        System.out.println(contaDestino.getSaldo());
        char d = '\u03A6';
        boolean resultadoDaTransferencia = cc.transferir(contaOrigem, contaDestino, 30);

        System.out.println(d);
        System.out.println("Realizada com sucesso: " + resultadoDaTransferencia);

        System.out.println(contaOrigem.getSaldo());
        System.out.println(contaDestino.getSaldo());

        Conta c1 = new Conta("1111-9", 200);
        Conta c2 = new Conta("1111-9", 200);

        Cliente cliente1 = new Cliente("Leandro", "3333", "9999", "leandro@gmail.com");
        Cliente cliente2 = new Cliente("Leandro", "5555", "8888", "paulo@gmail.com");
        Conta contaDoCliente = new Conta("1111-9", 200, cliente1);
        Conta contaDoCliente2 = new Conta("1111-9", 200, cliente2);


        if (c1.equals(c2)) {
            System.out.println("As contas são iguais");
        } else {
            System.out.println("As contas são diferentes");
        }

        System.out.println(c1);
    }
}
