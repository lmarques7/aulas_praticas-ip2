package br.ufrpe.vendas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
        // Crio os objetos necessários para que uma Venda ocorra        
        Produto p1 = new Produto(77, "Feijão", "Feijão KiCaldo", 9.70);
        Produto p2 = new Produto(55, "Arroz", "Arroz KiCaldo", 6.50);
        Produto p3 = new Produto(99, "Carne", "Carne bovina", 50);
        
        ItemVenda it1 = new ItemVenda(p1, 2);
        ItemVenda it2 = new ItemVenda(p2, 5);
        ItemVenda it3 = new ItemVenda(p3, 1);
        
        LocalDate dataNascimento = LocalDate.of(1981, 2, 15);
        Cliente c1 = new Cliente("111555888-99", "Leandro", dataNascimento);
        
        // Criando a Venda efetivamente    
        
        Venda venda = new Venda(c1, LocalDateTime.now(), "Bruno Marques");
        venda.setClienteComprador(c1);
        
        venda.adicionaItem(it1);
        venda.adicionaItem(it2);
        venda.adicionaItem(it3);
        
        venda.listarItensVenda();
    }

}
