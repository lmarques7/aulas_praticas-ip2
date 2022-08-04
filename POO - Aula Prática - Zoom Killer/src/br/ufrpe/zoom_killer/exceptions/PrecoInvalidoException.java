package br.ufrpe.zoom_killer.exceptions;

public class PrecoInvalidoException extends Exception {
    
    private float precoAlvoInvalido;
    
    public PrecoInvalidoException(float preco) {
        this.precoAlvoInvalido = preco;
    }

    public float getPrecoAlvoInvalido() {
        return precoAlvoInvalido;
    }
}
