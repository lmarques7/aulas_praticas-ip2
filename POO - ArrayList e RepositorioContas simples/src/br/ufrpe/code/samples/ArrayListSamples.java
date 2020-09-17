package br.ufrpe.code.samples;

import java.util.ArrayList;

public class ArrayListSamples {

    public static void main(String[] args) {
        // 1 - ArrayLists - criação e manipulação        
        ArrayList<String> nomes = new ArrayList<>();
        
        // 2 - Métodos de ArrayList (Adicionar, remover, recuperar, concatenar)    
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Bruno");
        
        String n = nomes.get(2);
        System.out.println(n);

        if(nomes.contains("Pedro")) {
            nomes.remove("Pedro");
        }
        
        System.out.println(nomes.size());    
        System.out.println(nomes);
        
        ArrayList<String> nomes2 = new ArrayList<>();
        nomes2.add("Paula");
        nomes2.add("Vinicius");
        
        nomes.addAll(nomes2);

        // 4 - Usando for / foreach com ArrayList        
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        
        for (String elemento : nomes) {
            System.out.println(elemento);
        }
        
        // 5 - Wrapper (boxing e unboxing)        
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer num = 45;
        numeros.add(num);
        numeros.add(984351);
        
        // 6 - Array e ArrayList com GarbageColletion (GC)
        // Explicação nos slides

    }

}
