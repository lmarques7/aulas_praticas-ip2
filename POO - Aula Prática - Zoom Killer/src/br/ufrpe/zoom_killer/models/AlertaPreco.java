package br.ufrpe.zoom_killer.models;

public class AlertaPreco {
    
    private Usuario usuario;
    private Produto produto;
    private float precoAlvo;

    public AlertaPreco(Usuario usuario, Produto produto, float precoAlvo) {
        this.usuario = usuario;
        this.produto = produto;
        this.precoAlvo = precoAlvo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getPrecoAlvo() {
        return precoAlvo;
    }

    public void setPrecoAlvo(float precoAlvo) {
        this.precoAlvo = precoAlvo;
    }

}
