package megassena;

import java.util.Arrays;

public class MegaSenaSimulation {

    // ============================================================
    // ALTERE SOMENTE ESTE VALOR PARA FAZER NOVOS EXPERIMENTOS
    // ============================================================
    private static final int TAMANHO_BILHETE = 15;

    private static final int NUMEROS_DA_MEGA_SENA = 60;
    private static final int INTERVALO_IMPRESSAO = 10_000;

    void main() {

        System.out.println("==========================================");
        System.out.println("       SIMULAÇÃO DA MEGA-SENA");
        System.out.println("==========================================");
        System.out.println("Tamanho de cada aposta: " + TAMANHO_BILHETE);
        System.out.println("Números possíveis: " + NUMEROS_DA_MEGA_SENA);
        System.out.println();

        MegaSena megaSena = new MegaSena();

        int[] sorteio = megaSena.sortear();

        System.out.println("Números sorteados: "
                + Arrays.toString(sorteio));
        System.out.println();

        long quantidadeApostas = 0;

        while (true) {

            quantidadeApostas++;

            int[] aposta = megaSena.gerarAposta(TAMANHO_BILHETE);

            // Mostra algumas apostas no início para deixar
            // evidente que o programa está efetivamente apostando.
            if (quantidadeApostas <= 10) {
                System.out.println(
                        "Aposta " + quantidadeApostas + ": "
                                + Arrays.toString(aposta));
            }

            // A partir daqui, verifica se a aposta contém
            // todos os 6 números sorteados.
            if (megaSena.acertou(aposta, sorteio)) {

                System.out.println();
                System.out.println("==========================================");
                System.out.println("             GANHOU!");
                System.out.println("==========================================");
                System.out.println("Quantidade de apostas: " + quantidadeApostas);
                System.out.println("Aposta vencedora: "
                        + Arrays.toString(aposta));
                System.out.println("Sorteio: "
                        + Arrays.toString(sorteio));
                System.out.println();

                break;
            }

            if (quantidadeApostas % INTERVALO_IMPRESSAO == 0) {

                System.out.println(
                        "Já foram realizadas "
                                + quantidadeApostas
                                + " apostas...");
            }
        }
    }
}


