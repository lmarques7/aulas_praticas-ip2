package br.ufrpe.zoom_killer.models;

import java.time.LocalDate;

public class OfertaProduto {
    
    private Produto produto;
    private float preco;
    private Loja lojaOfertante;
    private LocalDate data;

    public OfertaProduto(Produto produto, float preco, Loja lojaOFertante,
            LocalDate data) {
        this.produto = produto;
        this.preco = preco;
        this.lojaOfertante = lojaOFertante;
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Loja getLojaOfertante() {
        return lojaOfertante;
    }

    public void setLojaOfertante(Loja lojaOfertante) {
        this.lojaOfertante = lojaOfertante;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OfertaProduto [produto=" + produto + ", preco=" + preco
                + ", lojaOFertante=" + lojaOfertante + ", data=" + data + "]";
    }

}
