package br.ufrpe.dungeons_game;

import java.util.Random;

public class Mapa {
    
    private char[][] matriz;
    private int posicaoXJogador;
    private int posicaoYJogador;
    private Personagem jogador;
    
    private static final char CHAO = '_';
    private static final char ESPINHOS = '^';
    private static final char FLECHAS = '#';
    private static final char BURACO = '@';
    private static final char CHAMAS = '*';
    private static final char TESOURO = 'T';
    private static final char JOGADOR = 'P';
    
    public Mapa(Personagem j) {
        this.jogador = j;
        this.matriz = new char[10][10];
        this.matriz[0][0] = TESOURO;
        this.matriz[9][9] = JOGADOR;
        
        this.posicaoXJogador = 9;
        this.posicaoYJogador = 9;
        realizarSorteioMapa();
    }
    
    public void movimentarJogador(char direcao) {
        switch (direcao) {
        case 'W': // CIMA
        case 'w': 
            if (posicaoYJogador > 0) {
                posicaoYJogador--;
            }
            break;
        case 'S': // BAIXO
        case 's':
            if (posicaoYJogador < this.matriz.length - 1) {
                posicaoYJogador++;
            }
            break;
        case 'A': // ESQUERDA
        case 'a':
            if (posicaoXJogador > 0) {
                posicaoXJogador--;
            }
            break;
        case 'D':// DIREITA
        case 'd':
            if (posicaoXJogador < this.matriz[0].length - 1) {
                posicaoXJogador++;
            }
            break;
        }
        
        matriz[posicaoYJogador][posicaoXJogador] = JOGADOR;
    }
    
    private void realizarSorteioMapa() {
        Random seed = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!((i == 0 && j == 0) || (i == 9 && j == 9))) {
                    int randomNum = seed.nextInt(100) + 1;
                    if (randomNum <= 35) {
                        matriz[i][j] = CHAO;
                    } else if (randomNum <= 65) {
                        matriz[i][j] = ESPINHOS;
                    } else if (randomNum <= 85) {
                        matriz[i][j] = FLECHAS;
                    } else if (randomNum <= 95) {
                        matriz[i][j] = BURACO;
                    } else if (randomNum <= 100) {
                        matriz[i][j] = CHAMAS;
                    }
                }
            }
        }
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                buffer.append(matriz[i][j] + " ");
            }
            buffer.append("\n");
        }
        
        return buffer.toString();
    }
}
