package br.ufrpe.ingressos_copa;

public class Pessoa {

    private String nome;
    private long cpf;
    private String paisOrigem;

    public Pessoa(String nome, long cpf, String paisOrigem) {
        this.nome = nome;
        this.cpf = cpf;
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", paisOrigem='" + paisOrigem + '\'' +
                '}';
    }
}
