
public class ProgramaLivroAutor {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Paulo", "paulo@xxx.com", 'M');
        Autor autor2 = new Autor("Marcelo", "marcelo@gmail.com", 'M');
        
        Livro livro1 = new Livro("O Senhor do anéis", autor1, 35.90, 30);
        Livro livro2 = new Livro("Menino pobre", autor2, 5.90, 100);
        
        System.out.println( "Nome do livro 1: " + livro1.getName() );
        System.out.println( "Preço do livro 1: " + livro1.getPrice() );
        System.out.println( "Nome do autor do livro 1: " +  livro1.getAutor().getName() );
        
        System.out.println("=============");
        System.out.println(livro1.toString());
        
        System.out.println("=============");
        System.out.println(livro1);

    }

}
