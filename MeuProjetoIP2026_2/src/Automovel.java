public class Automovel {

    private String modelo;
    private boolean estaLigado;
    private double velocidade;
    private String cor;

    public Automovel() {
        velocidade = 0;
        estaLigado = false;
    }

    public Automovel(boolean estaLigadoInicial, double velocidadeInicial) {
        estaLigado = estaLigadoInicial;
        velocidade = velocidadeInicial;
    }

    void ligar () {
        estaLigado = true;
    }

    void acelerar () {
        velocidade = velocidade + 5;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "modelo='" + modelo + '\'' +
                ",\n estaLigado=" + estaLigado +
                ",\n velocidade=" + velocidade +
                ",\n cor='" + cor + '\'' +
                '}';
    }

    public boolean equals (Object o) {
        boolean retorno = false;
        Automovel parametro = (Automovel) o; //  nao se preocupem por enquanto

        if (this.estaLigado == parametro.estaLigado &&
                this.velocidade == parametro.velocidade &&
                this.cor.equals(parametro.cor) &&
                this.modelo.equals(parametro.modelo)) {
            retorno = true;
        }

        return retorno;
    }
}
