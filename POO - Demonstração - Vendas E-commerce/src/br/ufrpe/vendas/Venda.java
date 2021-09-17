package br.ufrpe.vendas;

import java.time.LocalDateTime;

public class Venda {

    private Cliente clienteComprador;
    private ItemVenda[] itensDeVenda;
    private LocalDateTime dataHoraVenda;
    private String atendente;
    private int indiceProximoItemVenda;

    public Venda(Cliente clienteComprador, LocalDateTime dataHoraVenda, String atendente) {
        this.clienteComprador = clienteComprador;
        this.dataHoraVenda = dataHoraVenda;
        this.atendente = atendente;
        this.itensDeVenda = new ItemVenda[100];
        this.indiceProximoItemVenda = 0;
    }
    
    public void adicionaItem(ItemVenda item) {
        this.itensDeVenda[this.indiceProximoItemVenda] = item;
        this.indiceProximoItemVenda++;
    }
    
    public void listarItensVenda() {
        System.out.printf("Data da venda: %s\n", this.dataHoraVenda);
        System.out.printf("Cliente: %s | CPF: %s | Idade: %s\n", this.clienteComprador.getNome(),
                this.clienteComprador.getCpf(), this.clienteComprador.calcularIdade());
        System.out.printf("Atendente: %s\n", this.atendente);
        
        System.out.printf("%-20s|%-13s|%-12s|%-13s\n", "Nome do produto", "Preço", "Quantidade", "Total");
        for (int i = 0; i < 61; i++) System.out.printf("-");
        System.out.println();
        for (int i = 0; i < this.indiceProximoItemVenda; i++) {
            System.out.printf("%-20s|$%12.2f|%12d|$%12.2f\n", 
                    this.itensDeVenda[i].getProdutoVendido().getNome(),
                    this.itensDeVenda[i].getProdutoVendido().getPreco(),
                    this.itensDeVenda[i].getQuantidade(),
                    this.itensDeVenda[i].getQuantidade() * this.itensDeVenda[i].getProdutoVendido().getPreco());
        }
        for (int i = 0; i < 61; i++) System.out.printf("-");
        System.out.println();
        System.out.printf("%-48s$%12.2f\n", "Total da venda:", this.calcularTotal());
    }
    
    public double calcularTotal() {
        double resultado = 0;
        for (int i = 0; i < this.indiceProximoItemVenda; i++) {
            resultado += (this.itensDeVenda[i].getQuantidade() * this.itensDeVenda[i].getProdutoVendido().getPreco());
        }
        return resultado;
    }

}
