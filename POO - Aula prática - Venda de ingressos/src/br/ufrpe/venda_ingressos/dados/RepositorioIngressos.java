package br.ufrpe.venda_ingressos.dados;

import java.util.ArrayList;

import br.ufrpe.venda_ingressos.negocio.beans.Ingresso;

public class RepositorioIngressos {
    
    private ArrayList<Ingresso> ingressos;

    public RepositorioIngressos(int tamanhoInicial) {
        this.ingressos = new ArrayList<>(tamanhoInicial);
    }
    
    public void adicionar(Ingresso i) {
        this.ingressos.add(i);
    }
    
    public ArrayList<String> nomesPagantes (String nomeFilme) {
        ArrayList<String> resultado = new ArrayList<>();
        
        // For na estrutura padrão sem usar a estrutura de foreach
//        for (int i = 0; i < this.ingressos.size(); i++) {
//            Ingresso ing = this.ingressos.get(i);
//        }
        
        for (Ingresso ing : this.ingressos) {
            if (ing.getSessao().getNomeFilme().equals(nomeFilme)) {
                resultado.add(ing.getPessoa().getNome());
            }
        }
        
        return resultado;
    }

}
