
public class Casa {
    
    private String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    public void setCor(String s) {
        cor = s;
    }
    
    public void pinta(String s) {
        cor = s;
    }
       
    public String getCor() {
        return cor;
    }
    
    int quantasPortasEstaoAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) {
            contador++;
        }
        if (porta2.estaAberta()) {
            contador++;
        }
        if (porta3.estaAberta()) {
            contador++;
        }
        return contador;
    }

}
