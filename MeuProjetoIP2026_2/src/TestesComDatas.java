import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestesComDatas {

    public static void main(String[] args) {
        var dataAgora = LocalDateTime.now();
        var dataDaquiADias = dataAgora.plusDays(20);

        System.out.println("Data daqui a alguns Dias: " + dataDaquiADias);

        LocalDate dataNascimentoAlguem = LocalDate.of(2006, 8, 24);
        var hoje = LocalDate.now();

        var idade = dataNascimentoAlguem.until(hoje, ChronoUnit.YEARS);
        System.out.println("Idade: " + idade);
    }
}
