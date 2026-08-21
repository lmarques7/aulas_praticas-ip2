public class Automovel {

    String modelo;
    String cor;
    boolean ligado;
    private float velocidadeAtual;

    public Automovel() {
        modelo = "Ferrari";
        cor = "vermelha";
        ligado = false;
        velocidadeAtual = 0;
    }

    public Automovel(String novoModelo, String novaCor) {
        modelo = novoModelo;
        cor = novaCor;
        ligado = false;
        velocidadeAtual = 0;
    }

    public Automovel(String novoModelo, int novaVelocidadeAtual) {
        modelo = novoModelo;
        ligado = false;
        velocidadeAtual = novaVelocidadeAtual;
    }

    public Automovel(int novaVelocidadeAtual, String novoModelo) {
        modelo = novoModelo;
        ligado = false;
        velocidadeAtual = novaVelocidadeAtual;
    }

    void ligar() {
        ligado = true;
    }

    void desligar() {
        ligado = false;
    }

    void acelerar() {
        velocidadeAtual = velocidadeAtual + 10;
    }

    void frear() {
        velocidadeAtual = velocidadeAtual - 10;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

}
