package br.ufrpe.zoologico;

public class Peixe extends Animal {

    private int qtdBarbatanas;
    private int qtdCaudas;

    public Peixe(String nome, int qtdBarbatanas, int qtdCaudas) {
        super(nome, "cinzenta");
        this.qtdBarbatanas = qtdBarbatanas;
        this.qtdCaudas = qtdCaudas;
        this.setNumeroPatas(0);
        this.setAmbiente(Ambiente.MARITIMO);
    }

    public int getQtdBarbatanas() {
        return qtdBarbatanas;
    }

    public void setQtdBarbatanas(int qtdBarbatanas) {
        this.qtdBarbatanas = qtdBarbatanas;
    }

    public int getQtdCaudas() {
        return qtdCaudas;
    }

    public void setQtdCaudas(int qtdCaudas) {
        this.qtdCaudas = qtdCaudas;
    }

}
