package enumeracao;

public enum OpcoesMenu {
	SALVAR(1), IMPRIMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	private final int valor;

	OpcoesMenu(int valorOpcao) {
		valor = valorOpcao;
		System.out.println("Construtor invocado. Valor: " + valor);
	}

	public int getValor() {
		return valor;
	}
	
}
