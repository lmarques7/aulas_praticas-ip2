import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparacaoEstudantes {

    public static void main(String[] args) {
        List<Estudante> lista = new ArrayList<> ();
        Estudante[] arrayE = {new Estudante("Abraao", 8.12, LocalDate.of(1999, 01, 01)),
                new Estudante("Leandro", 8.32, LocalDate.of(1998, 01, 01)),
                new Estudante("Bruno", 6.32, LocalDate.of(1996, 01, 01)),
                new Estudante("Fabio", 7.32, LocalDate.of(2001, 01, 01)),
                new Estudante("Hugo", 9.32, LocalDate.of(2000, 01, 01))};
        
        lista.addAll(Arrays.asList(arrayE));
        System.out.println(lista);

        Collections.sort(lista);
        
        System.out.println(lista);
        
        lista.sort(new ComparadorPorData());
        
        System.out.println(lista);
    }

}
