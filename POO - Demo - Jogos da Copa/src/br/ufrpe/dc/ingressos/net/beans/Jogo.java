package br.ufrpe.dc.ingressos.net.beans;

import java.time.LocalDateTime;

public class Jogo {

    private String timeA;
    private String timeB;
    private String nomeEstadio;
    private LocalDateTime dataHoraJogo;

    public Jogo(String timeA, String timeB, String nomeEstadio,
            LocalDateTime dataHoraJogo) {
        this.setTimeA(timeA);
        this.setTimeB(timeB);
        this.setNomeEstadio(nomeEstadio);
        this.dataHoraJogo = dataHoraJogo;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        if (timeA != null && !timeA.isEmpty()) {
            this.timeA = timeA;
        }
    }

    public String getTimeB() {
        return timeB;
    }

    public void setTimeB(String timeB) {
        if (timeB != null && !timeB.isEmpty()) {
            this.timeB = timeB;
        }
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        if (nomeEstadio != null && !nomeEstadio.isEmpty()) {
            this.nomeEstadio = nomeEstadio;
        }
    }

    public LocalDateTime getDataHoraJogo() {
        return dataHoraJogo;
    }

    @Override
    public String toString() {
        return "Jogo [timeA=" + timeA + ", timeB=" + timeB + ", nomeEstadio="
                + nomeEstadio + ", dataHoraJogo=" + dataHoraJogo + "]";
    }

    
}
