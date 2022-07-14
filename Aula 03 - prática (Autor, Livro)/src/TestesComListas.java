import java.util.ArrayList;

public class TestesComListas {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        ArrayList<Integer> numerosLista = new ArrayList<>();

        numerosLista.add(5);
        numerosLista.add(10);
        numerosLista.add(15);
        numerosLista.add(20);

        if (numerosLista.contains(10)) {
            System.out.println("Esta lista contém o número 10");
        }


        ArrayList<Autor> autores = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            autores.add(ProgramaLivroAutor.recuperaAutorDoTeclado());
        }

        Autor a0 = autores.get(0);
        autores.remove(a0);
        autores.set(0, a0);
        if (autores.contains(a0)) {
            System.out.println("Autor a0 está na lista");
        }
        System.out.println(autores.contains(new Autor("asdfas", "asds", 'D')));
    }
}
