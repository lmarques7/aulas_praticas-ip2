public class Jogo {

    private String equipeA;
    private String equipeB;
    private int horarioInicio;
    private String nomeEstadio;

    public Jogo(String equipeA, String equipeB, int horarioInicio, String nomeEstadio) {
        this.setEquipeA(equipeA);
        this.setEquipeB(equipeB);
        this.setHorarioInicio(horarioInicio);
        this.setNomeEstadio(nomeEstadio);
    }

    public String getEquipeA() {
        return equipeA;
    }

    private void setEquipeA(String equipeA) {
        if (equipeA == null || equipeA.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.equipeA = equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    private void setEquipeB(String equipeB) {
        if (equipeB == null || equipeB.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.equipeB = equipeB;
    }

    public int getHorarioInicio() {
        return horarioInicio;
    }

    private void setHorarioInicio(int horarioInicio) {
        if (horarioInicio < 0 || horarioInicio > 23) {
            throw new IllegalArgumentException();
        }
        this.horarioInicio = horarioInicio;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    private void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }
}
