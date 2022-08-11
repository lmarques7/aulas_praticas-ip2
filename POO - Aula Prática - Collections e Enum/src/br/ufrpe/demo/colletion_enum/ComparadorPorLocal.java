package br.ufrpe.demo.colletion_enum;

import java.util.Comparator;

public class ComparadorPorLocal implements Comparator<Evento> {

    @Override
    public int compare(Evento e1, Evento e2) {
        return e1.getLocal().getName().compareTo(e2.getLocal().getName());
    }

}
