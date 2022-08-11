package br.ufrpe.demo.colletion_enum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento implements Comparable<Evento>{
    
    private CidadeEnum local;
    private LocalDateTime dataHora;
    private String nome;
    
    public Evento(CidadeEnum local, LocalDateTime dataHora, String nome) {
        this.local = local;
        this.dataHora = dataHora;
        this.nome = nome;
    }

    public CidadeEnum getLocal() {
        return local;
    }

    public void setLocal(CidadeEnum local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((dataHora == null) ? 0 : dataHora.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Evento other = (Evento) obj;
        if (dataHora == null) {
            if (other.dataHora != null)
                return false;
        } else if (!dataHora.equals(other.dataHora))
            return false;
        if (local != other.local)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public int compareTo(Evento outro) {
        return this.getDataHora().compareTo(outro.getDataHora());
    } 
    
    @Override
    public String toString() {
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Name: " + this.nome + " - Cidade: " + this.getLocal().getName() 
                + " - Data: " + this.dataHora.format(padrao);
    }
    
}
