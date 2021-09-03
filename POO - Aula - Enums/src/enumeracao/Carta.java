package enumeracao;

public class Carta {
    private ValorCarta carta;
    private Naipe naipe;
    
    public Carta(ValorCarta carta, Naipe naipe) {
      this.carta = carta;
      this.naipe = naipe;
    }
    
    /**
     * @return the carta
     */
    public ValorCarta getCarta() {
      return carta;
    }
    /**
     * @param carta the carta to set
     */
    public void setCarta(ValorCarta carta) {
      this.carta = carta;
    }
    /**
     * @return the naipe
     */
    public Naipe getNaipe() {
      return naipe;
    }
    /**
     * @param naipe the naipe to set
     */
    public void setNaipe(Naipe naipe) {
      this.naipe = naipe;
    }
    
    @Override
    public String toString() {
        return this.carta.name() + "-" + this.naipe.name();
    }
    
    
}
