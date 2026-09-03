package br.ufrpe.code.sistema_bancario;

import java.util.ArrayList;

public class RepositorioContas {
    
    private final ArrayList<Conta> contas;
    
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
                    break;
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

    /**
     * Retorna a primeira ocorrência da Conta cujo número é entregue como parâmetro
     * @param numero Número da conta procurada
     * @return A objeto Conta procurado
     */
    public Conta obterContaPorNumero(String numero) {
        Conta resultado = null;
        for (Conta interna : contas) {
            if (interna.getNumero().equals(numero)) {
                resultado = interna;
                break;
            }
        }
        return resultado;
    }
    
    public String toString() {
        // Lembre-se toString não imprime nada, somente retorna uma 
        // representação textual do objeto em questão 
        String resultado = "";
        for (Conta c : this.contas) {
            String saldoFormatado = String.format("%.2f", c.getSaldo());
            resultado += c.getNumero() + "  |  Saldo: " + saldoFormatado + "\n";
        }
            
        return resultado;
    }
}
