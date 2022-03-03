package br.ufrpe.dc.ingressos.net.dados;

import java.util.ArrayList;
import java.util.Collections;

import br.ufrpe.dc.ingressos.net.beans.Ingresso;
import br.ufrpe.dc.ingressos.net.beans.Pessoa;

public class RepositorioIngressos {
    private ArrayList<Ingresso> ingressos;

    public RepositorioIngressos() {
        this.ingressos = new ArrayList<>();
    }
    
    public void adicionarIngresso(Ingresso novoIngresso) {
        this.ingressos.add(novoIngresso);
    }
    
    public ArrayList<Ingresso> listarPorEstadio() {
        Collections.sort(this.ingressos);
        return this.ingressos;
    }
    
    /**
     * Operação que retorna os nomes das pessoas que compraram ingressos 
     * para os jogos de uma determinada seleção.
     */
    public ArrayList<String> pessoasQueCompraramIngresssosParaJogoDe(String nomeSelecao) {
        ArrayList<String> nomesPessoas = new ArrayList<>();
        for(Ingresso i : this.ingressos) {
            if (i.getJogo().getTimeA().equals(nomeSelecao) 
                    || i.getJogo().getTimeB().equals(nomeSelecao)) {
                nomesPessoas.add(i.getPagante().getNome());
            }
        }
        return nomesPessoas;
    }
    
    /**
     * Operação que retorna uma lista de Pessoas representando os torcedores de
     * um determinado país que estão assistindo aos jogos da sua própria
     * seleção.
     */
    public ArrayList<Pessoa> espectadoresDaPropriaSelecao(){
        ArrayList<Pessoa> torcedoresDoProprioPais = new ArrayList<>();
        for(Ingresso i : this.ingressos) {
            if (i.getPagante().getPaisDeOrigem().equals(i.getJogo().getTimeA()) 
                    || i.getPagante().getPaisDeOrigem().equals(i.getJogo().getTimeB()) ) {
                torcedoresDoProprioPais.add(i.getPagante());
            }
        }
        return torcedoresDoProprioPais;
    }
    
    
    
    
    
    
    
    
}
