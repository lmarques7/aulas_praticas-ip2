package br.ufrpe.code.sistema_bancario;

public class Banco {
    
    public static void main(String[] args) {
        RepositorioContas repo = new RepositorioContas(100);

        // Simulando inserção de contas (CREATE)
        String novoNumeroConta = "1234-5";
        boolean contaAdicionada = repo.addConta(new Conta(novoNumeroConta, 150.95));
        if (contaAdicionada) {
            System.out.printf("Conta [%s] adicionada com sucesso %d/%d/%d\n", novoNumeroConta, 3, 9, 2026);
        }

        Conta contaComNumeroAleatorio = new Conta(); // Conta com número aleatório e saldo 0.0
        String numeroAleatorio = contaComNumeroAleatorio.getNumero();
        repo.addConta(contaComNumeroAleatorio);

        repo.addConta(new Conta("45611-5", 66150.95));
        contaAdicionada = repo.addConta(new Conta("45611-5", 8498));
        if (!contaAdicionada) {
            System.out.printf("Conta [%s] NÃO FOI adicionada pois número já existia\n", novoNumeroConta);
        }
        repo.addConta(new Conta("9875-5", 300000));

        // Simulando recuperação (READ) de conta
        Conta contaObtidoDoRepositorio = repo.obterContaPorNumero(numeroAleatorio);
        contaObtidoDoRepositorio.creditar(450.36);
        contaObtidoDoRepositorio.debitar(355.39);

        String resultado = repo.toString();
        System.out.println(resultado);

        // Simulando remoção de conta (DELETE)
        String contaASerRemovida = "9875-5";
        boolean contaRemovida = repo.removerConta(contaASerRemovida);
        if (contaRemovida) {
            System.out.printf("Conta [%s] foi removida com sucesso\n", contaASerRemovida);
        }

        System.out.println(repo);
    }

}
