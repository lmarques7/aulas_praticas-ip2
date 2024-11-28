package br.ufrpe.sistema_escolar;

public class Pessoa {
    
    private String nome;
    private String endereco;
    
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s. Endereço: %s", this.nome, this.endereco);
    }

}
