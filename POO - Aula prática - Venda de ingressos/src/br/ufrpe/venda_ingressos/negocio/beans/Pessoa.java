package br.ufrpe.venda_ingressos.negocio.beans;

public class Pessoa {

    private int idade;
    private long cpf;
    private String nome;

    public Pessoa(int idade, long cpf, String nome) {
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 16) {
            this.idade = idade;
        } else {
            // Exceção
        }
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        if (cpf > 0) {
            this.cpf = cpf;
        } else {
            // Exceção
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            // Usar exceção nesse caso
        }
    }

}
