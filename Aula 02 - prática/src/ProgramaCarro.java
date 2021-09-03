
public class ProgramaCarro {

    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        
        meuCarro.cor = "Azul";
        meuCarro.acelera();
        
        System.out.println(meuCarro.velocidadeAtual);
    }

}
