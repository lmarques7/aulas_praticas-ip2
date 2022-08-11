package br.ufrpe.demo.colletion_enum;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioEventos {
    
    private Map<String, Evento> eventos;
    
    public RepositorioEventos(Evento[] eventosArray) {
        this.eventos = new HashMap<>();
        for (Evento evento : eventosArray) {
            this.eventos.put(evento.getNome(), evento);
        }
    }
    
    public boolean contemEvento(Evento evento) {
        return this.eventos.containsValue(evento);
    }
    
    public boolean contemEvento(String nomeEvento) {
        return this.eventos.containsKey(nomeEvento);
    }
    
    public List<Evento> ordenarPorData() {
        Collection<Evento> colecaoEventos = this.eventos.values();  
        ArrayList<Evento> lista = new ArrayList<>(colecaoEventos);
        Collections.sort(lista);
        return lista;
    }
    
    public List<Evento> ordenarPorLocal() {
        Collection<Evento> colecaoEventos = this.eventos.values();
        ArrayList<Evento> lista = new ArrayList<>(colecaoEventos);
        Collections.sort(lista, new ComparadorPorLocal());
        return lista;
    }
    
    @Override
    public String toString() {
        return this.eventos.values().toString();
    }

    public static void main(String[] args) {
        Evento[] meusEventos = {
            new Evento(CidadeEnum.BH, LocalDateTime.of(2016,  05, 22, 12, 12, 12), "Vila Mix BH"),
            new Evento(CidadeEnum.FORTALEZA, LocalDateTime.of(2015,  05, 22, 12, 12, 12), "Show de forró"),            
            new Evento(CidadeEnum.RECIFE, LocalDateTime.of(2015,  11, 22, 12, 12, 12), "Show de brega"),
            new Evento(CidadeEnum.SAO_PAULO, LocalDateTime.of(2012,  05, 22, 12, 12, 12), "Show de reggae"),
            new Evento(CidadeEnum.CURITIBA, LocalDateTime.now(), "Show de funk"),
        };
        
        Evento e1 = meusEventos[0];
        System.out.println(e1);
        
        RepositorioEventos meuRepo = new RepositorioEventos(meusEventos);
        System.out.println(meuRepo);
        
        System.out.println(meuRepo.ordenarPorData());
        System.out.println(meuRepo.ordenarPorLocal());
    }
    
}
