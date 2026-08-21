package br.ufrpe.ingressos_copa;

public class Ingresso {

    private Jogo partida;
    private Pessoa pagante;
    private String cadeira;

    public Ingresso(Jogo partida, Pessoa pagante, String cadeira) {
        this.partida = partida;
        this.pagante = pagante;
        this.cadeira = cadeira;
    }

    public Jogo getPartida() {
        return partida;
    }

    public void setPartida(Jogo partida) {
        this.partida = partida;
    }

    public Pessoa getPagante() {
        return pagante;
    }

    public void setPagante(Pessoa pagante) {
        this.pagante = pagante;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
}
