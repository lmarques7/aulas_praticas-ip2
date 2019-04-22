package br.ufrpe.venda_ingressos.gui;

import br.ufrpe.venda_ingressos.negocio.ControladorIngressos;
import br.ufrpe.venda_ingressos.negocio.Fachada;
import br.ufrpe.venda_ingressos.negocio.beans.Pessoa;
import br.ufrpe.venda_ingressos.negocio.beans.Sessao;

public class TelaTextualTeste {
    
    private Fachada fachada;
    
    public TelaTextualTeste() {
        this.fachada = new Fachada();
    }

    public void testarInstanciasIngressos() {
        Pessoa p1 = new Pessoa(18, 34545, "Leandro");
        Pessoa p2 = new Pessoa(21, 56756, "Maria");
        Pessoa p3 = new Pessoa(33, 3246, "André");
        Pessoa p4 = new Pessoa(34, 897, "José");
        Pessoa p5 = new Pessoa(28, 2356, "Bruno");
        
        Sessao s1 = new Sessao("Azul", 18, 3);
        Sessao s2 = new Sessao("Amarelo", 20, 2);
        Sessao s3 = new Sessao("Preto", 21, 1);
        
        this.fachada.venderIngresso(p1, s1, "12A");
        this.fachada.venderIngresso(p3, s2, "11A");
        this.fachada.venderIngresso(p2, s1, "12B");
        this.fachada.venderIngresso(p5, s1, "34A");
        this.fachada.venderIngresso(p3, s2, "12A");
        this.fachada.venderIngresso(p4, s3, "25C");
        
        System.out.println(this.fachada.nomesPagantes("Azul"));
    }

}
