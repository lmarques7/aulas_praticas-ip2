package corporativo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;

    public Empresa(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(String nomeDepartamento) {
        // A empresa é passada ao departamento
        Departamento departamento = new Departamento(this, nomeDepartamento);
        departamentos.add(departamento);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String todosOsDepartamentos = "\t";

        for(int i = 0; i < departamentos.size(); i++) {
            todosOsDepartamentos = todosOsDepartamentos + departamentos.get(i).getNome() + "\n\t";
        }
        return "\nEmpresa{" +
                ", nome='" + nome + '\'' +
                "departamentos=\n" + todosOsDepartamentos +

                '}';
    }
}

