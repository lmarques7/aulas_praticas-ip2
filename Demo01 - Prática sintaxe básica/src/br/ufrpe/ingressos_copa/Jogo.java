package br.ufrpe.ingressos_copa;

import java.time.LocalDateTime;

public class Jogo {

    private String equipeA;
    private String equipeB;
    private String nomeEstadio;
    private LocalDateTime dataHora;

    public Jogo(String equipeA, String equipeB, String nomeEstadio, LocalDateTime dataHora) {
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.nomeEstadio = nomeEstadio;
        this.dataHora = dataHora;
    }

    public String getEquipeA() {
        return equipeA;
    }

    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
