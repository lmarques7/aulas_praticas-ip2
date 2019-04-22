package br.ufrpe.venda_ingressos.negocio;

import java.util.ArrayList;

import br.ufrpe.venda_ingressos.dados.RepositorioIngressos;
import br.ufrpe.venda_ingressos.negocio.beans.Ingresso;
import br.ufrpe.venda_ingressos.negocio.beans.Pessoa;
import br.ufrpe.venda_ingressos.negocio.beans.Sessao;

public class ControladorIngressos {

    private RepositorioIngressos repositorio;
    private static ControladorIngressos instance;

    private ControladorIngressos() {
        this.repositorio = new RepositorioIngressos(100);
    }
    
    public static ControladorIngressos getInstance() {
        if (instance == null) {
            instance = new ControladorIngressos();
        }
        return instance;
    }

    public boolean venderIngresso(Pessoa p, Sessao s, String poltrona) {
        boolean resultado = false;

        if (p != null && p.getCpf() > 0 && s != null && s.getHoraInicio() >= 0
                && s.getHoraInicio() <= 23) {
            Ingresso vendido = new Ingresso(p, s, poltrona);
            this.repositorio.adicionar(vendido);
            resultado = true;
        }

        return resultado;
    }

    public ArrayList<String> nomesPagantes(String nomeFilme) {
        return repositorio.nomesPagantes(nomeFilme);
    }

}
