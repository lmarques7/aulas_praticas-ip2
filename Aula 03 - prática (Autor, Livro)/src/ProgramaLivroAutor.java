import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaLivroAutor {

    private ArrayList<Autor> autores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Autor autor1 = ProgramaLivroAutor.recuperaAutorDoTeclado();
        Autor autor2 = ProgramaLivroAutor.recuperaAutorDoTeclado();
        
        Livro livro1 = new Livro("O Senhor do anéis", 35.90, 30);
        livro1.addAutor(autor1);
        livro1.addAutor(autor2);

        System.out.println("=============");
        System.out.println(livro1);
        
    }

    public static Autor recuperaAutorDoTeclado() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do autor: ");
        String nomeA = s.nextLine();
        System.out.println();
        System.out.println("Digite o email do autor: ");
        String emailA = s.nextLine();
        System.out.println();
        System.out.println("Digite o gênero do autor: ");
        String genderA = s.nextLine();
        System.out.println();
        return new Autor(nomeA, emailA, genderA.charAt(0));
    }

}
