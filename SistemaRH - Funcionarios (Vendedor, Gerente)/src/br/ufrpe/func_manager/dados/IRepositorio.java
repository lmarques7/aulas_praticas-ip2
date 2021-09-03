package br.ufrpe.func_manager.dados;

import java.time.LocalDate;
import java.util.List;

import br.ufrpe.func_manager.beans.Funcionario;

public interface IRepositorio {

    boolean inserir(Funcionario novoF);

    Funcionario buscar(int codigo);

    boolean remover(int codigo);

    boolean atualizar(int codigo, Funcionario novoF);

    List<Funcionario> listarPorCargo(Class tipoFuncionario);

    List<Funcionario> ganhamAcimaDe(double salario);

    double calcularMediaSalarialGerentes();

    Funcionario obterFuncionarioMaisNovo();
    
    double calcularMediaSalarialPorPeriodo(LocalDate inicio, LocalDate fim);

}