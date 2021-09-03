
public class Pessoa {
    
    String nome;
    int idade;
    
    void fazerAniversario() {
        idade = idade + 1;
    }
    
    public static void main(String[] args) {
        Pessoa a1 = new Pessoa();
        Pessoa a2 = new Pessoa();
        a1.nome = "Marcos";
        a2.nome = "Bruna";
        
        a1.fazerAniversario();
        
        a2.fazerAniversario();
        a2.fazerAniversario();
        a2.fazerAniversario();
        
        System.out.println(a1.idade);
        System.out.println(a2.idade);
       
    }
    
}
