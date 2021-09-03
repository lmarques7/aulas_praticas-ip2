package br.ufrpe.func_manager.dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.ufrpe.func_manager.beans.Funcionario;
import br.ufrpe.func_manager.beans.Gerente;

public class RepositorioFuncionariosArray implements IRepositorio {

    private ArrayList<Funcionario> funcionarios;

    public RepositorioFuncionariosArray() {
        this.funcionarios = new ArrayList<Funcionario>(50);
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#inserir(br.ufrpe.func_manager.beans.Funcionario)
     */
    @Override
    public boolean inserir(Funcionario novoF) {
        boolean resultado = false;
        if (novoF != null) {
            boolean haCodigoIgual = false;
            for (Funcionario f : funcionarios) {
                if (f.getCodigo() == novoF.getCodigo()) {
                    haCodigoIgual = true;
                }
            }
            if (!haCodigoIgual) {
                this.funcionarios.add(novoF);
                resultado = true;
            }
        }
        return resultado;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#buscar(int)
     */
    @Override
    public Funcionario buscar(int codigo) {
        Funcionario retorno = null;
        int indice = this.buscarIndice(codigo);
        if (indice >= 0) {
            retorno = this.funcionarios.get(indice);
        }

        return retorno;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#remover(int)
     */
    @Override
    public boolean remover(int codigo) {
        Funcionario f = this.buscar(codigo);
        boolean resultado = false;
        if (f != null) {
            this.funcionarios.remove(f);
            resultado = true;
        }
        return resultado;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#atualizar(int, br.ufrpe.func_manager.beans.Funcionario)
     */
    @Override
    public boolean atualizar(int codigo, Funcionario novoF) {
        boolean resultado = false;
        int indice = this.buscarIndice(codigo);
        if (indice >= 0) {
            this.funcionarios.set(indice, novoF);
            resultado = true;
        }
        return resultado;
    }

    private int buscarIndice(int codigo) {
        int indice = -1;
        for (int i = 0; i < funcionarios.size() && indice < 0; i++) {
            if (funcionarios.get(i).getCodigo() == codigo) {
                indice = i;
            }
        }
        return indice;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#listarPorCargo(java.lang.Class)
     */
    @Override
    public List<Funcionario> listarPorCargo(Class tipoFuncionario) {
        List<Funcionario> lista = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f.getClass().equals(tipoFuncionario)) {
                lista.add(f);
            }
        }
        return lista;
    }
    
    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#ganhamAcimaDe(double)
     */
    @Override
    public List<Funcionario> ganhamAcimaDe(double salario) {
        List<Funcionario> lista = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f.getSalario() > salario) {
                lista.add(f);
            }
        }
        return lista;
    }
    
    public Funcionario umQueGanhaAcimaDe(double salario) {
        Funcionario resultado = null;
        for (int i = 0; i < funcionarios.size() && resultado != null; i++) {
            if (funcionarios.get(i).getSalario() > salario) {
                resultado = funcionarios.get(i);
            }
        }
        return resultado;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#calcularMediaSalarialGerentes()
     */
    @Override
    public double calcularMediaSalarialGerentes() {
        double resultado = 0.0;
        int contador = 0;
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i) instanceof Gerente) {
                resultado += funcionarios.get(i).getSalario();
                contador++;
            }
        }
        if (contador > 0) {
            resultado = resultado / contador;
        }
        return resultado;
    }

    /* (non-Javadoc)
     * @see br.ufrpe.func_manager.dados.IRepositorio#obterFuncionarioMaisNovo()
     */
    @Override
    public Funcionario obterFuncionarioMaisNovo() {
        Funcionario maisNovo = null;
        for (Funcionario f : funcionarios) {
            if (maisNovo == null) {
                maisNovo = f;
            } else {
                if (maisNovo.getDataAdmissao().isAfter(f.getDataAdmissao())) {
                    maisNovo = f;
                }
            }

        }
        return maisNovo;
    }

    @Override
    public double calcularMediaSalarialPorPeriodo(LocalDate inicio,
            LocalDate fim) {
        double acumulador = 0;
        int contador = 0;
        for (Funcionario f: this.funcionarios) {
            if (f.getDataAdmissao().isAfter(inicio) && f.getDataAdmissao().isBefore(fim)) {
                acumulador += f.getSalario();
                contador++;
            }
        }
        double resultado = 0;
        if (contador > 0) {
            resultado = acumulador / contador;
        }
        return resultado;
    }
}
