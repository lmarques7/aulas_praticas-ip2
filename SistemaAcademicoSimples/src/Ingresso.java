public class Ingresso {
    private Pessoa pagante;
    private Jogo jogo;
    private String assento;

    public Ingresso(Pessoa pagante, Jogo jogo, String cadeira) {
        this.pagante = pagante;
        this.jogo = jogo;
        this.assento = cadeira;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Pessoa getPagante() {
        return pagante;
    }

    public void setPagante(Pessoa pagante) {
        this.pagante = pagante;
    }
}
