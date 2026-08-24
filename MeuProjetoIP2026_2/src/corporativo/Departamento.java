package corporativo;

class Departamento {
    private Empresa empresa;
    private String nome;

    public Departamento(Empresa empresa, String nome) {
        if (empresa == null) {
            // Levanta exceção
            throw new IllegalArgumentException("");
        }
        this.empresa = empresa;
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "empresa=" + empresa +
                ", nome='" + nome + '\'' +
                '}';
    }
}

