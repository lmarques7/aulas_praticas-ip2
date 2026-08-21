import java.util.ArrayList;
import java.util.Objects;

public class Sapo {

    private float peso;
    private String cor;
    private float tamanho;
    private final static float PESO_MAXIMO = 100;

    public Sapo(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getPESO_MAXIMO() {
        return PESO_MAXIMO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sapo sapo = (Sapo) o;
        return Float.compare(peso, sapo.peso) == 0 && Float.compare(tamanho, sapo.tamanho) == 0 && Objects.equals(cor, sapo.cor);
    }

    public static void main(String[] args) {
        ArrayList<Sapo> meusSapinhos = new ArrayList<>();

        Sapo especial = new Sapo("Verde");
        Sapo nadaEspecial = new Sapo("Verde");
        meusSapinhos.add(new Sapo("Amarela"));
        meusSapinhos.add(new Sapo("Azul"));
        meusSapinhos.add(especial);
        meusSapinhos.add(new Sapo("Roxo"));

        boolean encontrei = false;

        for (int i = 0; i < meusSapinhos.size() && !encontrei; i++) {
            if(meusSapinhos.get(i).getCor().startsWith("V")) {
                encontrei = true;
            }
            System.out.println(meusSapinhos.get(i).getCor());
        }

        if (meusSapinhos.contains(nadaEspecial)) {
            System.out.println("realmente o verde está contido");
        }

    }
}
