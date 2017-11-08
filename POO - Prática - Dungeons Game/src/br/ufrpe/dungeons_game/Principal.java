package br.ufrpe.dungeons_game;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Personagem p = new Personagem("Leandro", 3);
        Mapa m = new Mapa(p);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite W S A D para movimentar o jogador (CIMA, BAIXO, ESQ, DIR): ");
            char direcao = s.nextLine().charAt(0);
            m.movimentarJogador(direcao);
            
            System.out.println(m);
        }
    }

}
