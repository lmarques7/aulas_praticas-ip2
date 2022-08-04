package br.ufrpe.zoom_killer.models;

public class Loja {
    
    private String id;
    private String nome;
    private String endSite;

    public Loja(String id, String nome, String endSite) {
        this.id = id;
        this.nome = nome;
        this.endSite = endSite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndSite() {
        return endSite;
    }

    public void setEndSite(String endSite) {
        this.endSite = endSite;
    }

    @Override
    public String toString() {
        return "Loja [id=" + id + ", nome=" + nome + ", endSite=" + endSite
                + "]";
    }
    

}
