package enumeracao;

import java.util.ArrayList;

public class TesteCarta {

  public static void main(String[] args) {
//    Carta asDePaus = new Carta(ValorCarta.A, Naipe.PAUS);
//    System.out.println(asDePaus.getCarta().valor);
//    
//    ArrayList<Carta> deck = new ArrayList<>();
//    deck.add(new Carta(ValorCarta.A, Naipe.PAUS));
//    deck.add(new Carta(ValorCarta.K, Naipe.OURO));
//    deck.add(new Carta(ValorCarta.Q, Naipe.ESPADA));
//    deck.add(new Carta(ValorCarta.DEZ, Naipe.COPAS));
    
    ArrayList<Carta> deckCompleto = new ArrayList<>();
    for (Naipe p : Naipe.values()) {
        for (ValorCarta vc : ValorCarta.values()) {
            deckCompleto.add(new Carta(vc, p));
        }
    }
    
    System.out.println(deckCompleto.size());
    System.out.println(deckCompleto);
    
//    imprimirCartas(deck);
  }

  public static void imprimirCartas(ArrayList<Carta> cartas) {
      for (Carta carta : cartas) {
          switch(carta.getNaipe()) {
          case COPAS:
              System.out.println(carta.getNaipe());
              break;
          case PAUS:
              break;
          case OURO:
              break;
          case ESPADA:
              break;
          }
      }
  }
}
