import java.util.Comparator;

public class ComparadorPorData implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getDataNascimento().compareTo(o2.getDataNascimento());
    }

}
