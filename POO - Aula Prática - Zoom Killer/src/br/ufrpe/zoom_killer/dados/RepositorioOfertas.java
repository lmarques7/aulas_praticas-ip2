package br.ufrpe.zoom_killer.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrpe.zoom_killer.models.OfertaProduto;

public class RepositorioOfertas {
    
    private ArrayList<OfertaProduto> ofertasProdutos = new ArrayList<>();
    
    public void salvar(OfertaProduto op) {
        this.ofertasProdutos.add(op);
    }
    
    public List<OfertaProduto> listarOfertasProdutos() {
        return Collections.unmodifiableList(this.ofertasProdutos);
    }

}
