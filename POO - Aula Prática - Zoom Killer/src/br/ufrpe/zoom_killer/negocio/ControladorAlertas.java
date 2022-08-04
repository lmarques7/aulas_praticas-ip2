package br.ufrpe.zoom_killer.negocio;

import br.ufrpe.zoom_killer.dados.RepositorioAlertas;
import br.ufrpe.zoom_killer.exceptions.PrecoInvalidoException;
import br.ufrpe.zoom_killer.models.AlertaPreco;
import br.ufrpe.zoom_killer.models.OfertaProduto;
import br.ufrpe.zoom_killer.models.Usuario;

public class ControladorAlertas {
    
    private RepositorioAlertas repositorioAlertas = new RepositorioAlertas();
    
    public void alertarUsuarioSobrePrecoAtingido(Usuario u, OfertaProduto p) {
        for (AlertaPreco ap : this.repositorioAlertas.listarAlertasPreco()) {
            if (ap.getUsuario().equals(u) 
                    && ap.getProduto().equals(p.getProduto())
                    && ap.getPrecoAlvo() <= p.getPreco()) {
                    // envia msg whatsapp para o usuario
            }
        }
    }

    public void salvarAlerta(AlertaPreco ap) throws PrecoInvalidoException {
        repositorioAlertas.salvarAlerta(ap);
    }
    
    

}
