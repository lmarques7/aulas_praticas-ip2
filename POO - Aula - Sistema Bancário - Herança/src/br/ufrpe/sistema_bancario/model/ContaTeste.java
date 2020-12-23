package br.ufrpe.sistema_bancario.model;

import br.ufrpe.sistema_bancario.dados.RepositorioContas;

public class ContaTeste {

    public static void main(String[] args) {
        
        RepositorioContas repositorioContas = new RepositorioContas(100);
        Conta c = new Conta("1234-5", 40);
        Conta p = new Poupanca("9876-5");
        Conta ce = new ContaEspecial("6548-1");
        
        repositorioContas.addConta(c);
        repositorioContas.addConta(ce);
        repositorioContas.addConta(p);
    }

}
