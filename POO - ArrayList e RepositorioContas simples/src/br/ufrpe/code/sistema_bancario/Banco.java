package br.ufrpe.code.sistema_bancario;

public class Banco {
    
    public static void main(String[] args) {
        RepositorioContas repo = new RepositorioContas(100);
        
        repo.addConta(new Conta("1234-5", 150.95));
        repo.addConta(new Conta("9875-5", 3150.95));
        repo.addConta(new Conta("45611-5", 66150.95));
        repo.addConta(new Conta("45611-5", 8498));
        
        String resultado = repo.toString();
        System.out.println(resultado);
        
        repo.removerConta("9875-5");
        
        System.out.println(repo);
    }

}
