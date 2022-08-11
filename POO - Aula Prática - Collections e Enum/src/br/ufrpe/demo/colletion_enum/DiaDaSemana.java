package br.ufrpe.demo.colletion_enum;

public enum DiaDaSemana {
    
    SEGUNDA_FEIRA("Segunda-feira"), 
    TERCA_FEIRA("Terça-feira"), 
    QUARTA_FEIRA("Quarta-feira"), 
    QUINTA_FEIRA("Quinta-feira"), 
    SEXTA_FEIRA("Sexta-feira"), 
    SABADO("Sábado"), 
    DOMINGO("Domingo");
    
    DiaDaSemana(String name) {
        this.name = name;
    }
    
    private String name;

    public String getName() {
        return name;
    }
    
    

}
