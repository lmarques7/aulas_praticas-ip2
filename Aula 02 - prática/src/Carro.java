
public class Carro {
    
    String cor;
    boolean ligado;
    int velocidadeAtual;

    Carro() {
        cor = "Amarelo";
        ligado = false;
        velocidadeAtual = 0;
    }
    
    void liga() {
        // Procedimento para ligar
    }
    
    void acelera(){
        velocidadeAtual = velocidadeAtual + 5;
    }
    
    void freia() {
        // Procedimento para freiar
    }
    
}
