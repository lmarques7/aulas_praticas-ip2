import java.time.LocalDate;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente c = new Cliente(LocalDate.of(2000, 9, 16), "Leandro");
        System.out.println(c.calcularIdade());
    }
}
