package br.ufrpe.dc.ingressos.net;

import java.time.LocalDateTime;
import java.time.Month;

import br.ufrpe.dc.ingressos.net.beans.Ingresso;
import br.ufrpe.dc.ingressos.net.beans.Jogo;
import br.ufrpe.dc.ingressos.net.beans.Pessoa;
import br.ufrpe.dc.ingressos.net.dados.RepositorioIngressos;

public class Teste {
    
    public static void main(String[] args) {
        Pessoa[] pessoas = {
            new Pessoa("Leandro", "Brasil", 1234123411),
            new Pessoa("Marcos", "Alemanha", 444555666),
            new Pessoa("Alessandra", "México", 77788899666L)
        };
        
        Jogo[] jogos = {
            new Jogo("Brasil", "Alemanha", "Mineirão", LocalDateTime.of(2014, Month.JUNE, 16, 16, 0)),
            new Jogo("Russia", "Ucrania", "Europa", LocalDateTime.of(2014, Month.JUNE, 21, 23, 0))
        };
        
        Ingresso i1 = new Ingresso(pessoas[0], jogos[0], "3A", "55D");
        Ingresso i2 = new Ingresso(pessoas[1], jogos[1], "5A", "12D");
        Ingresso i3 = new Ingresso(pessoas[2], jogos[1], "2A", "77D");
        
        System.out.println(i1.getPagante().getPaisDeOrigem());
        System.out.printf("%s X %s, em %s", i2.getJogo().getTimeA(), 
                i2.getJogo().getTimeB(), i2.getJogo().getNomeEstadio());
        
        System.out.println("\n\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
        RepositorioIngressos repositorio = new RepositorioIngressos();
        
        repositorio.adicionarIngresso(i1);
        repositorio.adicionarIngresso(i2);
        repositorio.adicionarIngresso(i3);
        
        System.out.println(repositorio.listarPorEstadio());
        
        System.out.println("\n\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
        System.out.println(repositorio.pessoasQueCompraramIngresssosParaJogoDe("Brasil"));
        
        System.out.println("\n\n\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
        System.out.println(repositorio.espectadoresDaPropriaSelecao());
    }

}
