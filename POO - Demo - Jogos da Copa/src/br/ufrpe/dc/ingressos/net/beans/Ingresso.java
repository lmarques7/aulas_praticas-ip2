package br.ufrpe.dc.ingressos.net.beans;

public class Ingresso implements Comparable<Ingresso> {

    private Pessoa pagante;
    private Jogo jogo;
    private String setor;
    private String cadeira;

    public Ingresso(Pessoa pagante, Jogo jogo, String setor, String cadeira) {
        this.setPagante(pagante);
        this.setJogo(jogo);
        this.setSetor(setor);
        this.setCadeira(cadeira);
    }

    public Pessoa getPagante() {
        return pagante;
    }

    public void setPagante(Pessoa pagante) {
        if (pagante != null) {
            this.pagante = pagante;
        }    
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        if (jogo != null) {
            this.jogo = jogo;
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor != null && !setor.isEmpty()) {
            this.setor = setor;
        }
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        if (cadeira != null && !cadeira.isEmpty()) {
            this.cadeira = cadeira;
        }
    }

    @Override
    public int compareTo(Ingresso param) {
        String estadioParaComparar = param.getJogo().getNomeEstadio();
        return this.jogo.getNomeEstadio().compareTo(estadioParaComparar);
    }

    @Override
    public String toString() {
        return "Ingresso [pagante=" + pagante + ", jogo=" + jogo + ", setor="
                + setor + ", cadeira=" + cadeira + "]";
    }

}
