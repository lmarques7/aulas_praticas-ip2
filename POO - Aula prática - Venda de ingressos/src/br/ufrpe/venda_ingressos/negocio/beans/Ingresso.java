package br.ufrpe.venda_ingressos.negocio.beans;

public class Ingresso {

    private Pessoa pessoa;
    private Sessao sessao;
    private String poltrona;

    public Ingresso(Pessoa pessoa, Sessao sessao, String poltrona) {
        this.setPessoa(pessoa);
        this.setPoltrona(poltrona);
        this.setSessao(sessao);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            this.pessoa = pessoa;
        } else {
            // Exceção
        }
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        if (sessao != null) {
            this.sessao = sessao;
        } else {
            // Exceção
        }
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        if (poltrona != null && !poltrona.isEmpty()) {
            this.poltrona = poltrona;
        } else {
            // Exceção
        }
    }

}
