import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatasDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento com ano, depois mes, depois ano");
        int ano = sc.nextInt();
        int mes = sc.nextInt();
        int dia = sc.nextInt();

        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(ano, mes, dia);

        System.out.println("Hoje: " + hoje);
        System.out.println("Data de nascimento: " + nascimento);

        System.out.println("Dias Vividos por vc: " + Period.between(nascimento, hoje).getDays());

        // Demonstrar métodos como plusDays, minusMonths, getDayOfWeek.
        // Demonstrar método until e Period.between

    }
}
