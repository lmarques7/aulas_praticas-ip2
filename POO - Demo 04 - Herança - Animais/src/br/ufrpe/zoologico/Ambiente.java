package br.ufrpe.zoologico;

public enum Ambiente {
    TERRESTE(0), AEREO(2), MARITIMO(1);
    
    private int poder;
    
    Ambiente(int poder) {
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }
}
