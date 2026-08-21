import java.util.ArrayList;

public class RepositorioIngressos {

    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    public void adicionarIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

    public ArrayList<Pessoa> listaPessoasQueAssistiramAosJogosDoSeuPais() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        for (Ingresso i : this.ingressos) {
            if (i.getPagante().getPaisOrigem().equals(i.getJogo().getEquipeA()) ||
                    i.getPagante().getPaisOrigem().equals(i.getJogo().getEquipeB())) {
                pessoas.add(i.getPagante());
            }
        }
        return pessoas;
    }
}
