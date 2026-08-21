package br.ufrpe.ingressos_copa;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RepositorioIngressos {

    private ArrayList<Ingresso> ingressos;

    public RepositorioIngressos() {
        this.ingressos = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

    public ArrayList<Pessoa> getPessoasTorcedorasDoProprioPais(String nomePais) {
        ArrayList<Pessoa> resultado = new ArrayList<>();
        for (Ingresso ingressoTestado : this.ingressos) {
            if (ingressoTestado.getPagante().getPaisOrigem().equals(nomePais)) {
                resultado.add(ingressoTestado.getPagante());
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        RepositorioIngressos repositorio = new RepositorioIngressos();

        Pessoa a = new Pessoa("Leandro", 8828882, "Brasil");
        Pessoa b = new Pessoa("Silva", 8828882, "Brasil");
        Pessoa c = new Pessoa("Maria", 8828882, "Venezuela");

        Jogo j = new Jogo("Brasil", "Italia", "mané garrincha", LocalDateTime.now());

        Ingresso i = new Ingresso(j, a, "B");
        Ingresso i2 = new Ingresso(j, b, "C");
        Ingresso i3 = new Ingresso(j, c, "F");

        repositorio.adicionarIngresso(i);
        repositorio.adicionarIngresso(i2);
        repositorio.adicionarIngresso(i3);

        System.out.println(repositorio.getPessoasTorcedorasDoProprioPais("Brasil"));
    }

}
