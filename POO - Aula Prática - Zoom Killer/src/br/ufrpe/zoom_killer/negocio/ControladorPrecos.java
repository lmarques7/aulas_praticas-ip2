package br.ufrpe.zoom_killer.negocio;

import java.time.LocalDate;

import br.ufrpe.zoom_killer.dados.RepositorioOfertas;
import br.ufrpe.zoom_killer.models.Loja;
import br.ufrpe.zoom_killer.models.OfertaProduto;
import br.ufrpe.zoom_killer.models.Produto;

public class ControladorPrecos {
    
    private RepositorioOfertas repositorioOfertas = new RepositorioOfertas();
    
    //Executar este método a cada 30 minutos
    public void crawlOFertasProdutos() {
        // 1 - buscar preços nas lojas cadastradas
        // acessar a lista de lojas
        // buscar todos os NOVOS preços de produtos
        // comparar com os preços atuais para verificar se houve alteração
        Loja l = null;
        float preco = 65.73F;
        int sku = 74773663;
        Produto p = null;
        
        OfertaProduto op = new OfertaProduto(p, preco, l, LocalDate.now());
        // salvar informação no repositório persistente
        this.repositorioOfertas.salvar(op);
    }
    
    public OfertaProduto buscarProdutoPorNome(String nome) {
        OfertaProduto resultado = null;
        for (OfertaProduto op : this.repositorioOfertas.listarOfertasProdutos()) {
            if (op.getProduto().getNome().equalsIgnoreCase(nome)) {
                resultado = op;
            }
        }
        return resultado;
    }

}
