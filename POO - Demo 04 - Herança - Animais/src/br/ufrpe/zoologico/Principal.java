package br.ufrpe.zoologico;

public class Principal {
    
    public static void main(String[] args) {
        Animal a = new Mamifero("urso-do-canada", "parda", 180);
        Animal c = new Mamifero("camelo", "bege", 220);
        Peixe p = new Peixe("Tubarao", 2, 1);
        
        Zoologico zoo = new Zoologico();
        zoo.addAnimal(a);
        zoo.addAnimal(c);
        zoo.addAnimal(p);
        
        System.out.println(zoo.listarAnimais());
    }

}
