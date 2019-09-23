package br.ufrpe.func_manager.gui;

import java.time.LocalDate;
import java.util.List;

import br.ufrpe.func_manager.beans.Funcionario;
import br.ufrpe.func_manager.beans.Gerente;
import br.ufrpe.func_manager.beans.Vendedor;
import br.ufrpe.func_manager.dados.RepositorioFuncionariosArray;

public class SistemaRH {
    
    public static void main(String[] args) {
        RepositorioFuncionariosArray repositorio = new RepositorioFuncionariosArray();
        repositorio.inserir(new Gerente(1, "Leandro", 3000, LocalDate.of(2017, 2, 6), "Vendas"));
        repositorio.inserir(new Gerente(2, "Maria", 4000, LocalDate.of(2014, 2, 6), "Vendas"));
        repositorio.inserir(new Gerente(3, "Bruna", 6000, LocalDate.of(2018, 2, 6), "Admin"));
        repositorio.inserir(new Gerente(4, "Lemos", 2000, LocalDate.of(2019, 2, 1), "Admin"));
        repositorio.inserir(new Gerente(5, "Pedro", 1000, LocalDate.of(2017, 6, 6), "Admin"));
        
        repositorio.inserir(new Vendedor(6, "Pietro", 5000, LocalDate.of(2011, 6, 6), 1.5f));
        repositorio.inserir(new Vendedor(7, "Jorge", 1000, LocalDate.of(2012, 6, 6), 1.4f));
        repositorio.inserir(new Vendedor(8, "Diogo", 1500, LocalDate.of(2015, 1, 6), 1.2f));
        repositorio.inserir(new Vendedor(9, "Fernando", 1800, LocalDate.of(2016, 6, 6), 1.1f));
        repositorio.inserir(new Vendedor(10, "Andréa", 1350, LocalDate.of(2019, 1, 6), 1.0f));
        
        List<Funcionario> funcionarios = repositorio.listarPorCargo(Vendedor.class);
        SistemaRH.imprimirFolha(funcionarios);
    }
    
    public static void imprimirFolha(List<Funcionario> listaFuncionarios) {
        if (listaFuncionarios != null && !listaFuncionarios.isEmpty()) {
            System.out.printf("%-30s%-20s%-20s\n", "Nome", "Salário", "Função");
            for (Funcionario f : listaFuncionarios) {
                String fullName = f.getClass().getName();
                String lastName = fullName.substring(fullName.lastIndexOf('.') + 1);
                        
                System.out.printf("%-30s$%-18.2f%-20s\n", f.getNome(), f.getSalario(), lastName);
            }
        }
    }

}
