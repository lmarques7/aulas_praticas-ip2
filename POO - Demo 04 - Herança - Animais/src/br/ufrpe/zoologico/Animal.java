package br.ufrpe.zoologico;

public class Animal {
    private String nome;
    private String cor;
    private float comprimento;
    private int numeroPatas;
    private float velocidade;
    private Ambiente ambiente;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Animal(String nome, String cor, float comprimento,
            Ambiente ambiente) {
        this.nome = nome;
        this.cor = cor;
        this.comprimento = comprimento;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    
    

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", cor=" + cor + ", comprimento="
                + comprimento + ", \nnumeroPatas=" + numeroPatas + ", velocidade="
                + velocidade + ", ambiente=" + ambiente + "]";
    }

    public static void main(String[] args) {
        Animal a = new Animal("Amarela", "Passarinho canário", 0.2F,
                Ambiente.AEREO);
        System.out.println(a);
    }

}
