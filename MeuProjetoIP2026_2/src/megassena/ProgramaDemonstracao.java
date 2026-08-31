package megassena;

import java.util.Arrays;
import java.util.Random;

public class ProgramaDemonstracao {

    static void main() {
        int[] bilhetePremiado = {45, 9, 12, 37, 13, 21};
        Arrays.sort(bilhetePremiado);

        Random random = new Random();
        int contador = 0;
        boolean encontreiBilhete = false;


        while (!encontreiBilhete) {
            int[] bilheteApostado = new int[40];
            int num = random.nextInt(60) + 1;
            for (int i = 0; i < bilheteApostado.length; i++) {
                while (arrayContemNumero(num, bilheteApostado)) {
                    // É necessário gerar números distintos dentro do array de
                    // números. Isto é, eu preciso checar se o novo número gerado
                    // está contido no array. Se estiver, gera outro número, se não
                    // quebra o laço e adiciona no array.
                    num = random.nextInt(60) + 1;
                }
                bilheteApostado[i] = num;
            }

            Arrays.sort(bilheteApostado);
            contador++;
            if(estaContido(bilhetePremiado, bilheteApostado)){
                System.out.printf("Bilhete premiado [%s] e vc ganhou depois de %d tentativas\n",
                        arrayIntToString(bilheteApostado), contador);
                encontreiBilhete = true;
            } else {
                if (contador % 50000 == 0) {
                    System.out.printf("Não ganhei. " +
                            "Tentativa %d. Bilhete: %s\n",
                            contador, arrayIntToString(bilheteApostado));
                }
            }
        }
    }

    public static String arrayIntToString(int[] bilhete) {
        StringBuilder acumulador = new StringBuilder();
        for (int num : bilhete) {
            acumulador.append(num).append("   ");
        }
        return acumulador.toString();
    }

    public static boolean estaContido(int[] premio, int[] apostados){
        int numEncontrados = 0;
        for (int numPremiado : premio) {
            for (int numApostado : apostados) {
                if (numPremiado == numApostado) {
                    numEncontrados++;
                }
            }
        }
        return numEncontrados == premio.length;
    }

    private static boolean arrayContemNumero(int n, int[] numeros) {
        boolean achei = false;

        for (int i = 0; i < numeros.length && numeros[i] != 0 && !achei; i++) {
            if (numeros[i] == n) {
                achei = true;
            }
        }

        return achei;
    }


}
