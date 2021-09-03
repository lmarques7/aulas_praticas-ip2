
public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;
    
    void abre() {
        aberta = true;
    }
    
    void fecha() {
        aberta = false;
    }
    
    void pinta (String novaCor) {
        cor = novaCor;
    }
    
    boolean estaAberta() {
        return aberta;
    }
    
    public static void main(String[] args) {
        Porta p = new Porta();
        p.abre();
        
        p.fecha();
        
        p.abre();
        
        p.pinta("Amarela");
        System.out.println(p.cor);
        p.pinta("Azul");
        System.out.println(p.cor);
        p.pinta("Branco");
        System.out.println(p.cor);
        
        p.dimensaoX = 3.56;
        p.dimensaoY = 8.96;
        p.dimensaoZ = 1.49;
        
        boolean resultado = p.estaAberta();
        System.out.println(resultado);
    }

}
