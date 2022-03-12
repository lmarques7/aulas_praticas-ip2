package br.ufrpe.zoologico;

public class Mamifero extends Animal {

    private int tempoGestacao;
    private TipoAlimentacao alimento;

    public Mamifero(String nome, String cor, int tempoGestacao) {
        super(nome, cor);
        this.tempoGestacao = tempoGestacao;
        this.setAmbiente(Ambiente.TERRESTE);
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public TipoAlimentacao getAlimento() {
        return alimento;
    }

    public void setAlimento(TipoAlimentacao alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero [" + super.toString() + "\n\n tempoGestacao=" + tempoGestacao + ", alimento="
                + alimento + "]";
    }

}
