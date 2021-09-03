import java.time.LocalDate;

public class Estudante implements Comparable<Estudante> {

    private String nome;
    private double mediaGeral;
    private LocalDate dataNascimento;

    public Estudante(String nome, double mediaGeral, LocalDate dataNascimento) {
        this.nome = nome;
        this.mediaGeral = mediaGeral;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int compareTo(Estudante other) {
        int result = 0;
        if (this.mediaGeral < other.mediaGeral) {
            result = -1;
        } else if (this.mediaGeral > other.mediaGeral) {
            result = 1;
        }
        return result;
    }
    
    @Override
    public String toString() {
        return this.nome + ": " + this.mediaGeral + " Data nascimento: " + this.dataNascimento;
    }

}
