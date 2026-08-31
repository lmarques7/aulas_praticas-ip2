package megassena;

import java.util.Arrays;
import java.util.Random;

public class MegaSena {

    private static final int NUMEROS_DA_MEGA_SENA = 60;
    private static final int NUMEROS_SORTEADOS = 6;

    private final Random random = new Random();


    /**
     * Realiza o sorteio de 6 números distintos entre 1 e 60.
     */
    public int[] sortear() {

        return gerarBilhete(NUMEROS_SORTEADOS);
    }


    /**
     * Gera uma aposta com a quantidade de números especificada.
     * Os números são distintos.
     */
    public int[] gerarAposta(int quantidadeNumeros) {

        if (quantidadeNumeros < NUMEROS_SORTEADOS
                || quantidadeNumeros > NUMEROS_DA_MEGA_SENA) {

            throw new IllegalArgumentException(
                    "Uma aposta deve ter entre "
                            + NUMEROS_SORTEADOS + " e "
                            + NUMEROS_DA_MEGA_SENA + " números.");
        }

        return gerarBilhete(quantidadeNumeros);
    }


    /**
     * Verifica se uma aposta contém todos os números sorteados.
     * Exemplo:
     * Sorteio: [5, 10, 20, 30, 40, 50]
     * Aposta:  [1, 5, 10, 20, 30, 40, 50]
     * Resultado: true
     */
    public boolean acertou(int[] aposta, int[] sorteio) {
        for (int numeroSorteado : sorteio) {
            boolean encontrou = false;
            for (int numeroApostado : aposta) {
                if (numeroSorteado == numeroApostado) {
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou) {
                return false;
            }
        }
        return true;
    }


    /**
     * Gera um array de números distintos entre 1 e 60.
     */
    private int[] gerarBilhete(int quantidadeNumeros) {
        int[] bilhete = new int[quantidadeNumeros];
        for (int i = 0; i < bilhete.length; i++) {
            int numero;
            do {
                numero = random.nextInt(NUMEROS_DA_MEGA_SENA) + 1;
            } while (contem(bilhete, i, numero));
            bilhete[i] = numero;
        }

        Arrays.sort(bilhete);
        return bilhete;
    }


    /**
     * Verifica se o número já foi colocado no array.
     * <p>
     * Somente as posições de 0 até tamanho são consideradas.
     */
    private boolean contem(int[] array, int tamanho, int numero) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
