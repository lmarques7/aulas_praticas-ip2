package br.ufrpe.dc.ingressos.net.beans;

public class Pessoa {

    private String nome;
    private String paisDeOrigem;
    private long cpf;

    public Pessoa(String nome, String paisDeOrigem, long cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.paisDeOrigem = paisDeOrigem;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setCpf(long cpf) {
        if (cpf > 0) {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", paisDeOrigem=" + paisDeOrigem
                + ", cpf=" + cpf + "]";
    }

    
}
