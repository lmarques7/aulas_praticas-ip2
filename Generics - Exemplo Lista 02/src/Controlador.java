import java.util.HashMap;

public class Controlador {
    
    private RepositorioGenericoArrayList<Loja> repositorioLoja;
    private RepositorioGenericoArrayList<Produto> repositorioProduto;
    
    public Controlador() {
        this.repositorioLoja = new RepositorioGenericoArrayList<>();
        this.repositorioProduto = new RepositorioGenericoArrayList<>();  
        
    }

}
