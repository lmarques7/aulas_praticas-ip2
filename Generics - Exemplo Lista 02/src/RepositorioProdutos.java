import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {

    private List<Produto> produtos;
    
    public RepositorioProdutos() {
        this.produtos = new ArrayList<>();
    }
    
    private void addProduto(Produto p) {
        this.produtos.add(p);
    }
    
    // CRUD
}
