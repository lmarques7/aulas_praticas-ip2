package br.ufrpe.venda_ingressos.negocio;

import java.util.ArrayList;

import br.ufrpe.venda_ingressos.negocio.beans.Pessoa;
import br.ufrpe.venda_ingressos.negocio.beans.Sessao;

public class Fachada {
    
    private ControladorSessoes controladorSessoes;
    private ControladorIngressos controladorIngressos;
    
    public Fachada() {
        this.controladorIngressos = ControladorIngressos.getInstance();
        this.controladorSessoes = ControladorSessoes.getInstance();
    }

    public boolean venderIngresso(Pessoa p, Sessao s, String poltrona) {
        return controladorIngressos.venderIngresso(p, s, poltrona);
    }

    public ArrayList<String> nomesPagantes(String nomeFilme) {
        return controladorIngressos.nomesPagantes(nomeFilme);
    }

    
}
