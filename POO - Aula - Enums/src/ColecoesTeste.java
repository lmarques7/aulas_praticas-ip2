import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ColecoesTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> m = new TreeMap<String, Integer>();

        String st = null;
        while(true){
          st = sc.next();
          if(st.equals("fim")) break;
          if(m.containsKey(st)){
            int frequencia = m.get(st);
            m.put(st, frequencia+1);
          }else{
            m.put(st, 1);
          }
        }

        for (String chave : m.keySet()) {
          System.out.printf("%-10s%10s\n", chave, m.get(chave));
        }

        sc.close();
    }

}
