package beans;

import java.util.ArrayList;

public class TesteBaralho {

    public static void main(String[] args) {
        ArrayList<Carta> deck = new ArrayList<>();
        deck.add(new Carta(Naipe.COPAS, Valor.AS));
        deck.add(new Carta(Naipe.ESPADAS, Valor.REI));
        deck.add(new Carta(Naipe.PAUS, Valor.DAMA));
        deck.add(new Carta(Naipe.OUROS, Valor.DEZ));
        
        imprimirCartas(deck);
    }
    
    public static void imprimirCartas(ArrayList<Carta> cartas) {
        for (Carta carta : cartas) {
            switch(carta.getNaipe()) {
            case COPAS:
                System.out.println(carta.getNaipe());
                break;
            case PAUS:
                break;
            case OUROS:
                break;
            case ESPADAS:
                break;
            }
        }
    }

}
