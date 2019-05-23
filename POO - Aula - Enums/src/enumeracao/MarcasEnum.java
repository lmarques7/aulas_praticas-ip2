package enumeracao;

public enum MarcasEnum {
	AMAZON, DELL, HP, TOSHIBA, LG, SAMSUNG;
	
	public static void main(String[] args) {
		MarcasEnum hp = MarcasEnum.HP;
		MarcasEnum samsung = MarcasEnum.SAMSUNG;
		System.out.println("Nome da Marca = " + hp.name());
		System.out.println("Nome da Marca = " + samsung.name());
		MarcasEnum t = MarcasEnum.valueOf("TOSHIBA");
		
		System.out.println("Marca nova: " + t);
		System.out.println("Ordem de " + t + " é: " + t.ordinal());
	}
}
