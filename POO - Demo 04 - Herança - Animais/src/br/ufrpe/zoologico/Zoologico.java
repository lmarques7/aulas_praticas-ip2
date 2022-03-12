package br.ufrpe.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }
    
    public void addAnimal(Animal novo) {
        this.animais.add(novo);
    }
    
    public void removerAnimal(Animal falecido) {
        this.animais.remove(falecido);
    }
    
    public String listarAnimais() {
        StringBuffer buffer = new StringBuffer();
        for (Animal a : this.animais) {
            buffer.append(a.toString());
            buffer.append("\n--------------------\n");
        }
        return buffer.toString();
    }
}
