package br.ufrpe.vendas;

public class ItemVenda {

    private Produto produtoVendido;
    private int quantidade;

    public ItemVenda(Produto produtoVendido, int quantidade) {
        this.produtoVendido = produtoVendido;
        this.quantidade = quantidade;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
