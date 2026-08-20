import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        final String NOME_PADRAO_CARRO = "fusca";
        System.out.println("Meu programa de automoveis");

        // Invocar procedimento que captura os valores dos atributos de um carro do teclado
        Automovel meuCarro = capturarAutomovelDoTeclado();
        System.out.println(meuCarro);

        for (int i = 0; i < 2; i++) {
            meuCarro.acelerar();
        }

        System.out.println(meuCarro.getVelocidade());

        Automovel meuCarro2 = new Automovel(true, 50);
        meuCarro2.setModelo(NOME_PADRAO_CARRO);
        meuCarro2.setCor("azul");

        System.out.println(meuCarro2.getVelocidade());
        String nome = new String("leandro@gmail");
        String nada = "Leandro@gmail";

        if (nome.equalsIgnoreCase(nada)) {
            System.out.println("Strings são iguais");
        } else {
            System.out.println("Strings são diferentes");
        }

        if (meuCarro.equals(meuCarro2)) {
            System.out.println("o carro digitado no teclado é igual ao obj meuCarro2");
        }

    }

    public static Automovel capturarAutomovelDoTeclado() {

        Scanner teclado = new Scanner(System.in);

        Automovel automovelDoTeclado = new Automovel();
        automovelDoTeclado.setModelo(teclado.nextLine());
        automovelDoTeclado.setCor(teclado.nextLine());
        automovelDoTeclado.setEstaLigado(teclado.nextBoolean());
        automovelDoTeclado.setVelocidade(teclado.nextDouble());

        return automovelDoTeclado;

    }

}