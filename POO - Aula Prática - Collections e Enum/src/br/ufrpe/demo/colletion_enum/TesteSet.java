package br.ufrpe.demo.colletion_enum;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

    public static void main(String[] args) {
        Evento[] meusEventos = {
                new Evento(CidadeEnum.BH, LocalDateTime.of(2016,  05, 22, 12, 12, 12), "Vila Mix BH"),
                new Evento(CidadeEnum.FORTALEZA, LocalDateTime.of(2015,  05, 22, 12, 12, 12), "Show de forró"),            
                new Evento(CidadeEnum.RECIFE, LocalDateTime.of(2015,  11, 22, 12, 12, 12), "Show de brega"),
                new Evento(CidadeEnum.SAO_PAULO, LocalDateTime.of(2012,  05, 22, 12, 12, 12), "Show de reggae"),
                new Evento(CidadeEnum.CURITIBA, LocalDateTime.now(), "Show de funk"),
            };
        
        Set<Evento> eventos = new HashSet<>();
        
        for (Evento evento : meusEventos) {
            eventos.add(evento);
        }
        
        Evento novo = new Evento(CidadeEnum.RECIFE, LocalDateTime.of(2015,  11, 22, 12, 12, 12), "Show de brega");
        
        if(!eventos.add(novo)) {
            System.out.println("Elementos nao foi adicionado");
        }
    }

}
