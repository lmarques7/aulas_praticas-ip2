package br.ufrpe.zoom_killer.gui;

import java.util.Scanner;

import br.ufrpe.zoom_killer.exceptions.PrecoInvalidoException;
import br.ufrpe.zoom_killer.models.AlertaPreco;
import br.ufrpe.zoom_killer.models.CategoriaProdutoEnum;
import br.ufrpe.zoom_killer.models.OfertaProduto;
import br.ufrpe.zoom_killer.models.Produto;
import br.ufrpe.zoom_killer.negocio.ControladorAlertas;
import br.ufrpe.zoom_killer.negocio.ControladorPrecos;

public class InterfaceTextual {
    
    public static void main(String[] args) {
        // Representam de forma abstrata a sua GUI
        System.out.println("Digite o nome do produto que vc quer buscar: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        
        Produto p = new Produto ("12", "bola", "redonda", 
                CategoriaProdutoEnum.UTENSILIOS_DOMESTICOS);
        
        ControladorPrecos controladorPrecos = new ControladorPrecos();
        OfertaProduto op = controladorPrecos.buscarProdutoPorNome(nome);
        
        ControladorAlertas alertasControl = new ControladorAlertas();
        try {
            alertasControl.salvarAlerta(new AlertaPreco(null, null, -30));
        } catch (PrecoInvalidoException e) {
            System.out.println("Preço alvo inválido usado: " + e.getPrecoAlvoInvalido());
        }
    }

}
