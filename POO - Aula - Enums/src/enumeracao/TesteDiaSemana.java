package enumeracao;

public class TesteDiaSemana {

  public static void main(String[] args) {
    imprimeDiaSemana(DiaSemana.SEGUNDA);
  }

  public static void imprimeDiaSemana(DiaSemana dia) {
    for (DiaSemana d : DiaSemana.values()) {
      System.out.println(d);
    }
    
    switch (dia) {
    case SEGUNDA:

      break;
    case TERCA:

      break;
    case QUARTA:

      break;
    case QUINTA:

      break;
    case SEXTA:
      System.out.println("Hoje é o dia");
      break;
    case SABADO:
    case DOMINGO:

      break;
    }
  }

}
