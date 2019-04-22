package br.ufrpe.venda_ingressos.negocio;

public class ControladorSessoes {
    
    private static ControladorSessoes instance;
    
    // Classe vazia
    
    private ControladorSessoes() {
        
    }
    
    public static ControladorSessoes getInstance() {
        if (instance == null) {
            instance = new ControladorSessoes();
        }
        return instance;
    }

}
