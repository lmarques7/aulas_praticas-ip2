public class Pessoa {
    private String nome;
    private long cpf;
    private String paisOrigem;

    public Pessoa(String nome, long cpf, String paisOrigem) {
        this.setNome(nome);
        if (cpf <= 0) {
            throw new IllegalArgumentException("CPF invalido");
        } else {
            this.cpf = cpf;
        }
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
