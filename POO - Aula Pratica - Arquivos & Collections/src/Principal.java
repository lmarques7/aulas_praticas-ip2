import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        File f = new File("cvli_pernambuco_dezembro-2015.csv");
        FileInputStream fis = null;
        RepositorioCrimes repositorio = new RepositorioCrimes();
        processarCSV(f, fis, repositorio);

        System.out.println(repositorio.tresMunicipiosMaisViolentos());

        System.out.println(repositorio.tresMunicipiosMaisViolentosComMapEntry());

        System.out.println(repositorio.dataComMaisVitimas().format(Crime.FORMATTER));
    }

    private static void processarCSV(File f, FileInputStream fis, RepositorioCrimes repositorio) {
        try {
            fis = new FileInputStream(f);
            Scanner sc = new Scanner(fis);
            sc.nextLine();

            while (sc.hasNext()) {
                String linha = sc.nextLine();
                String[] pedacos = linha.split(",");
                Crime c = new Crime(pedacos[0], pedacos[1], pedacos[2], pedacos[3], pedacos[4], pedacos[5],
                        pedacos[6], pedacos[7]);
                repositorio.addCrime(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {e.printStackTrace();}
            }
        }
    }
}
