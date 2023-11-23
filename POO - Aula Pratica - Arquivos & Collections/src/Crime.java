import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Crime {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate data;
    private String nome;
    private String sexo;
    private String objetoUtilizado;
    private String municipio;
    private int idade;
    private String natureza;
    private int totalVitimas;

    public Crime(String data, String nome, String sexo, String objetoUtilizado, String municipio, String idade,
                 String natureza, String totalVitimas) {
        // Comentário sobre o construtor
        this.data = LocalDate.parse(data, FORMATTER);
        this.nome = nome;
        this.sexo = sexo;
        this.objetoUtilizado = objetoUtilizado;
        this.municipio = municipio;
        this.idade = idade != null && !idade.isEmpty() ? Integer.parseInt(idade) : 0;
        this.natureza = natureza;
        this.totalVitimas = Integer.parseInt(totalVitimas);
    }

    public Crime(LocalDate data, String nome, String sexo, String objetoUtilizado, String municipio, int idade,
                 String natureza, int totalVitimas) {
        this.data = data;
        this.nome = nome;
        this.sexo = sexo;
        this.objetoUtilizado = objetoUtilizado;
        this.municipio = municipio;
        this.idade = idade;
        this.natureza = natureza;
        this.totalVitimas = totalVitimas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObjetoUtilizado() {
        return objetoUtilizado;
    }

    public void setObjetoUtilizado(String objetoUtilizado) {
        this.objetoUtilizado = objetoUtilizado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public int getTotalVitimas() {
        return totalVitimas;
    }

    public void setTotalVitimas(int totalVitimas) {
        this.totalVitimas = totalVitimas;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "data=" + data +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", objetoUtilizado='" + objetoUtilizado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", idade=" + idade +
                ", natureza='" + natureza + '\'' +
                ", totalVitimas=" + totalVitimas +
                '}';
    }
}
