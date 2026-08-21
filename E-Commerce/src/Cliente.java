import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Cliente {
    private static LocalDate dataNascimento;
    private String nome;

    public Cliente(LocalDate dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public static void main(String[] args) {
        dataNascimento = LocalDate.of(2025,12,12);


        Math.sin(Math.toRadians(90));
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long calcularIdade() {
        return this.dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
