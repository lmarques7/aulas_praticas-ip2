import java.util.ArrayList;
import java.util.List;

public class RepositorioLoja {
    
    private List<Loja> lojas;
    
    public RepositorioLoja() {
        this.lojas = new ArrayList<>();
    }
    
    private void addProduto(Loja l) {
        this.lojas.add(l);
    }
    
    // CRUD
    
}
