public class StringsDemo {

    public static void main(String[] args) {
        String nome = new String("Leandro Marques");
        String nome2 = new String("Leandro Marques");
        // Discutir imutabilidade da String.
        // Comparação incorreta com == vs correta com equals.
        if (nome.equals(nome2)) {
            System.out.println("string iguais");
        } else {
            System.out.println("string nao iguais");
        }


        System.out.println("Tamanho: " + nome.length());
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Contém 'Mar'?: " + nome.contains("MAR"));
        System.out.println("Substituição: " + nome.replace("Marques", "Silva"));

    }
}
