package enums_tests;

import static enumeracao.OpcoesMenu.SALVAR;

import enumeracao.OpcoesMenu;

public class MenuEnumComparacao {
	public static void comparaEnum(OpcoesMenu opcao) {
	  switch (opcao) {
    case SALVAR:
      System.out.println("Foi escolhido a opção Salvar");
      break;
    case FECHAR:
      System.out.println("Foi escolhido a opção FECHAR");
      break;
    case ABRIR:
      System.out.println("Foi escolhido a opção ABRIR");
      break;
    case VISUALIZAR:
    case IMPRIMIR:
      System.out.println("qq coisa");
      break;
    }
	  
//		if (opcao.equals(SALVAR)) {
//			System.out.println("Foi escolhido a opção Salvar");
//		} else if (opcao.equals(ABRIR)) {
//			System.out.println("Foi escolhido a opção ABRIR");
//		} else if (opcao.equals(FECHAR)) {
//			System.out.println("Foi escolhido a opção FECHAR");
//		}
	}

	public static void main(String[] args) {
		comparaEnum(SALVAR);
	}
}
