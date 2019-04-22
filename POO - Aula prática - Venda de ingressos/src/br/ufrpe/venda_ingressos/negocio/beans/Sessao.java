package br.ufrpe.venda_ingressos.negocio.beans;

public class Sessao {

    private String nomeFilme;
    private int horaInicio;
    private int numeroSala;

    public Sessao(String nomeFilme, int horaInicio, int numeroSala) {
        this.setHoraInicio(horaInicio);
        this.setNomeFilme(nomeFilme);
        this.setNumeroSala(numeroSala);
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme != null) {
            this.nomeFilme = nomeFilme;
        } else {
            // Exceção
        }
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        if (horaInicio >= 0 && horaInicio <= 23) {
            this.horaInicio = horaInicio;
        } else {
            // Exceção
        }
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        if (numeroSala > 0) {
            this.numeroSala = numeroSala;
        } else {
            // Exceção
        }
    }

}
