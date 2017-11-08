package br.ufrpe.dungeons_game;

public class Personagem {
    
    public static int PERCENTUAL_POR_PORCAO = 20;
    
    private String nome;
    private int pocoes;
    private int percentualVida;
    
    public Personagem(String nome, int pocoes) {
        this.nome = nome;
        this.pocoes = pocoes;
        this.percentualVida = 100;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPercentualVida() {
        return percentualVida;
    }
    
    public void setPercentualVida(int percentualVida) {
        this.percentualVida = percentualVida;
    }
    
    public int getPocoes() {
        return pocoes;
    }
    
    public void usarPocao() {
        if (this.pocoes > 0) {
            this.percentualVida = this.percentualVida + PERCENTUAL_POR_PORCAO;
            if (this.percentualVida > 100) {
                this.percentualVida = 100;
            }
        }
    }

}
