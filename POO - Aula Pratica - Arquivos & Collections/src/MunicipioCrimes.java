public class MunicipioCrimes implements Comparable<MunicipioCrimes>{

    private String nome;
    private int qtdCrimes;

    public MunicipioCrimes(String nome, int qtdCrimes) {
        this.nome = nome;
        this.qtdCrimes = qtdCrimes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdCrimes() {
        return qtdCrimes;
    }

    public void setQtdCrimes(int qtdCrimes) {
        this.qtdCrimes = qtdCrimes;
    }

    @Override
    public int compareTo(MunicipioCrimes o) {
        return o.getQtdCrimes() - this.qtdCrimes;
    }

    @Override
    public String toString() {
        return "{nome='" + nome + '\'' +
                ", qtdCrimes=" + qtdCrimes +
                '}';
    }
}
