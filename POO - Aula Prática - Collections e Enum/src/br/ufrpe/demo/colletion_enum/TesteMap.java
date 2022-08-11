package br.ufrpe.demo.colletion_enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> m = new HashMap<String, Integer>();
        
        Map<String,String> table = new HashMap<>();
        
        table.get("backgroundColor");

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


    }

}
