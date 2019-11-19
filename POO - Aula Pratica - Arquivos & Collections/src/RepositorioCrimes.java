import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class RepositorioCrimes {

    private List<Crime> crimes;

    public RepositorioCrimes() {
        this.crimes = new ArrayList<>();
    }

    public void addCrime(Crime c) {
        this.crimes.add(c);
    }

    public int quantosCrimeDoTipo(String tipo, Month mes, int ano) {
        int resultado = 0;
        for (Crime c : this.crimes) {
            if (c.getNatureza() != null && c.getNatureza().equalsIgnoreCase(tipo) && c.getData().getMonth() == mes &&
            c.getData().getYear() == ano) {
                resultado++;
            }
        }
        return resultado;
    }

    public List<MunicipioCrimes> tresMunicipiosMaisViolentos() {
        List<MunicipioCrimes> resultado = new ArrayList<>();

        Map<String, Integer> municipioQtd = new HashMap<>();
        frequenciaCrimePorMunicipio(municipioQtd);

        for (String k : municipioQtd.keySet()) {
            MunicipioCrimes mc = new MunicipioCrimes(k, municipioQtd.get(k));
            resultado.add(mc);
        }

        Collections.sort(resultado);

        return resultado.subList(0, 3);
    }

    public List<Map.Entry<String,Integer>> tresMunicipiosMaisViolentosComMapEntry() {
        Map<String, Integer> municipioQtd = new HashMap<>();
        frequenciaCrimePorMunicipio(municipioQtd);

        List<Map.Entry<String,Integer>> rList = new ArrayList<>(municipioQtd.entrySet());

        rList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        return rList.subList(0, 3);
    }

    private void frequenciaCrimePorMunicipio(Map<String, Integer> municipioQtd) {
        for (Crime c : this.crimes) {
            if (municipioQtd.containsKey(c.getMunicipio())) {
                municipioQtd.put(c.getMunicipio(), municipioQtd.get(c.getMunicipio()) + 1);
            } else {
                municipioQtd.put(c.getMunicipio(), 1);
            }
        }
    }

    public LocalDate dataComMaisVitimas() {
        LocalDate data = null;
        Map<LocalDate, Integer> frequenciaCrimesPorData = new HashMap<>();
        for (Crime c : this.crimes) {
            if (frequenciaCrimesPorData.containsKey(c.getData())) {
                frequenciaCrimesPorData.put(c.getData(), frequenciaCrimesPorData.get(c.getData()) + 1);
            } else {
                frequenciaCrimesPorData.put(c.getData(), 1);
            }
        }

        List<Map.Entry<LocalDate, Integer>> listaR = new ArrayList<>(frequenciaCrimesPorData.entrySet());
        listaR.sort((o1, o2) -> o2.getValue() - o1.getValue());

        return listaR.get(0).getKey();
    }
}
