package br.ufrpe.lambdas_streams;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<String>();
        minhaLista.add("texto");
        minhaLista.add("bola");        
        minhaLista.add("padrão");
        minhaLista.add("texto");
        minhaLista.add("nome com mais de 10 chars");
        
        System.out.println(minhaLista);
        // Usando sort com Comparator e lambdas
        Collections.sort(minhaLista, (s1, s2) ->  s1.compareTo(s2));
        System.out.println(minhaLista);
        
        try {
            // Usando Streams a partir da classe Files e criando um Predicate
            Stream<Path> listaArq = Files.list(Paths.get("C:\\"));
            Predicate<Path> isDirectory = x -> Files.isDirectory(x);
            List<Path> pastas = listaArq.filter(isDirectory).collect(Collectors.toList());           
            System.out.println(pastas);
            listaArq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Chamando método processarListaString passando um Lambda
        System.out.println(processarListaString(minhaLista, s -> s.length() > 10));
        
        minhaLista.forEach(System.out::println);
        
        // Filtrando a lista e removendo elementos duplicados
        Set<String> novoConjunto = minhaLista.stream()
                .filter(p -> p.length() > 4)
                .collect(Collectors.toSet());
        System.out.println(novoConjunto);
        
        // Filtrando a lista e mapeando para maiúsculas
        List<String> novaLista = minhaLista.stream()
          .filter(s -> s.startsWith("b"))
          .map(s -> s.toUpperCase())
          .collect(Collectors.toList());
        
        // Chamando sysout em cada elemento usando referência a método
        novaLista.forEach(System.out::println);
        
        // Criando e usando uma BiFunction
        BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
        int soma = f.apply(12,3);
        System.out.println(soma);
        
        // Operações com IntStream usando boxed e toList
        List<Integer> listInt = IntStream.rangeClosed(2, 6).boxed().collect(Collectors.toList());
        System.out.println(listInt);
        
    }    
    
    public static List<String> processarListaString(List<String> lista, Verificador<String> v) {
        return lista.stream().filter(v::verifica).collect(Collectors.toList());
    }

}
