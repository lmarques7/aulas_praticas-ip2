package br.ufrpe.zoom_killer.models;

public enum CategoriaProdutoEnum {
    
    ELETRONICOS(2.35F), UTENSILIOS_DOMESTICOS(0.6F), FERRAMENTAS(1.2F), VESTUARIO(3.2F);
    
    private CategoriaProdutoEnum(float taxa) {
        this.taxaImposto = taxa;
    }
    
    float taxaImposto;

    public float getTaxaImposto() {
        return taxaImposto;
    }
    
}
