package beans;

import java.time.LocalDate;

public class Jogador {

    private String nome;
    private String login;
    private LocalDate dataNascimento;

    public Jogador(String nome, String login, LocalDate dataNascimento) {
        this.nome = nome;
        this.login = login;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
