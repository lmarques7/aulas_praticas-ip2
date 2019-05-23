package enums_tests;

import enumeracao.OpcoesMenu;

public class MenuEnumTeste {
	public static void main(String[] args) {
	  System.out.println("Primeira linha de código");
		for (OpcoesMenu op : OpcoesMenu.values()) {
			System.out.println("Menu " + op + " = " + op.getValor());
		}
	}
}
