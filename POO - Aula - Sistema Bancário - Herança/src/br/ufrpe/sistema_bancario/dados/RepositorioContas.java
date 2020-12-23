package br.ufrpe.sistema_bancario.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_bancario.model.Conta;
import br.ufrpe.sistema_bancario.model.ContaEspecial;
import br.ufrpe.sistema_bancario.model.Poupanca;

public class RepositorioContas {
    
    private ArrayList<Conta> contas;
    
    public RepositorioContas (int capacidadeInicial) {
        this.contas = new ArrayList<>(capacidadeInicial);       
    }

    /**
     * Este método adiciona uma nova conta no ArrayList se e somente se nenhuma
     * outra conta com o mesmo número não tiver sido adicionado anteriormente
     * 
     * @param c A conta a ser adicionada ao repositório
     * @return true - se a conta foi adicionada.
     *         false - se não foi
     */
    public boolean addConta(Conta c) {
        boolean resultado = false;
        if (c != null) {
            String num = c.getNumero();
            boolean existeContaComNumeroIgual = false;
            for (Conta interna : contas) {
                if (interna.getNumero().equals(num)) {
                    existeContaComNumeroIgual = true;
                }
            }
            if (!existeContaComNumeroIgual) {
                this.contas.add(c);
                resultado = true;
            }
        }
        return resultado;
    }
    
    /**
     * Remove o objeto Conta cujo número seja igual ao número informado como 
     * parâmetro.
     * 
     * @param numero O número da Conta a ser removida
     * @return true - se a conta foi removida.
     *         false - se não foi
     */
    public boolean removerConta(String numero) {
        boolean numeroExiste = false;
        int i;
        for (i = 0; i < this.contas.size() && !numeroExiste; i++) {
            Conta c = this.contas.get(i);
            if (c.getNumero().equals(numero)) {
                numeroExiste = true;
            }
        }
        if (numeroExiste) {
            this.contas.remove(i-1);
        }
        return numeroExiste;
    }
    
    public String toString() {
        // Lembre-se toString não imprime nada, somente retorna uma 
        // representação textual do objeto em questão 
        String resultado = "";
        for (Conta c : this.contas) {
            resultado = resultado + c.getNumero() + "  |  Saldo: " 
                            + c.getSaldo() + "\n";
        }
            
        return resultado;
    }
    
    public ArrayList<ContaEspecial> listarContasComSaldoNegativo() {
        ArrayList<ContaEspecial> resultado = new ArrayList<>();
        for (Conta c : this.contas) {
            if (c instanceof ContaEspecial && c.getSaldo() < 0) {
                resultado.add((ContaEspecial) c);
            }
        }
        return resultado;
    }
    
    public ArrayList<Poupanca> listarPoupancaComSaldoAcima(double valor) {
        ArrayList<Poupanca> poupancas = new ArrayList<>();
        for (Conta c : this.contas) {
            if (c instanceof Poupanca && c.getSaldo() > valor) {
                poupancas.add((Poupanca) c);
            }
        }
        return poupancas;
    }
}
