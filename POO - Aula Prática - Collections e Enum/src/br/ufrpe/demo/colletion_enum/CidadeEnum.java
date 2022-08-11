package br.ufrpe.demo.colletion_enum;

public enum CidadeEnum {
    
    RECIFE("Recife"), FORTALEZA("Fortaleza"), 
    SAO_PAULO("S�o Paulo"), 
    CURITIBA("Curitiba"),
    FLORIPA("Florian�polis"),
    BH("Belo Horizonte");
    
    private String name;
    
    CidadeEnum(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }

}
