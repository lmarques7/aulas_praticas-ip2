
public class ProgramaCasa {
    
    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        p1.abre();
        p2.fecha();
        p3.fecha();
        
        minhaCasa.porta1 = p1;
        minhaCasa.porta2 = p2;
        minhaCasa.porta3 = p3;
        minhaCasa.pinta("Amarela");
        
        System.out.println(minhaCasa.getCor());
        int numero = minhaCasa.quantasPortasEstaoAbertas();
        System.out.println(numero);
        
    }

}
