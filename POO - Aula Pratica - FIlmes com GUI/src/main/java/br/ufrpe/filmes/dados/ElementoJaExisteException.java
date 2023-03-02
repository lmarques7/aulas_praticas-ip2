package br.ufrpe.filmes.dados;

public class ElementoJaExisteException extends Exception {

	private static final long serialVersionUID = 4868332235826988515L;
	
	private Object elemento;
    
    public ElementoJaExisteException(Object obj) {
        super("Objeto j� est� cadastrado no reposit�rio e n�o pode ser "
                + "adicionado novamente");
        this.elemento = obj;        
    }
    
    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
}
