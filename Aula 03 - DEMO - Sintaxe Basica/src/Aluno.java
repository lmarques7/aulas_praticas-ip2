import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(int matricula, String nome, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }

    public String toString() {
        String resultado = "";
        resultado += "Nome: " + this.nome + "\n";
        resultado += "Matricula: " + this.matricula
                + " | Data de nascimento: " + this.dataNascimento + "\n";
        return resultado;
    }

    public boolean ehIgual(Aluno outroAluno) {
        boolean resultado = false;
        if (this.matricula == outroAluno.matricula &&
                Objects.equals(this.nome, outroAluno.nome) &&
                Objects.equals(this.dataNascimento, outroAluno.dataNascimento)) {
            resultado = true;
        }
        return resultado;
    }

}
