package br.ufrpe.sistema_bancario.model;

import br.ufrpe.sistema_bancario.dados.RepositorioContas;

public class ContaTeste {

    public static void main(String[] args) {

        RepositorioContas repositorioContas = new RepositorioContas(100);
        Conta c = new Conta("1234-5", 40);
        Conta p = new Poupanca("9876-5");
        p.creditar(100);
        Conta ce = new ContaEspecial("6548-1");

        repositorioContas.addConta(c);
        repositorioContas.addConta(ce);
        repositorioContas.addConta(p);

        // Quero fazer um PIX pra conta de número 9876-5
        Conta resposta = repositorioContas.procurarConta("9876-5");
        System.out.println(resposta.getSaldo());
        if (resposta instanceof Poupanca) {
            ((Poupanca) resposta).renderJuros(0.2);
        } else {
            System.out.println("instancia incorreta");
        }

        System.out.println("Depois de render juros: " + resposta.getSaldo());

    }

}
