public class EqualsDemo {

    public static void main(String[] args) {
        String s1 = new String("Java, excelente representante de OO");
        String s2 = new String("Java, excelente representante de OO");

        System.out.println(s1 == s2);       // false (endereços diferentes)
        System.out.println(s1.equals(s2));  // true (conteúdo igual)
    }
}
