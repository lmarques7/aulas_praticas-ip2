public class Principal {

    public static void main(String[] args) {
        Automovel a = new Automovel();
        System.out.println(a.modelo);

        a.cor = "preta";
        System.out.println(a.cor);

        Automovel b = new Automovel();
        b.modelo = "fiat mobi";
        b.cor = "azul";
        b.acelerar();
        b.acelerar();
        b.acelerar();

        System.out.println(b.getVelocidadeAtual());
        b.frear();
        System.out.println(b.getVelocidadeAtual());

        Automovel c = new Automovel("Fusca", "verde");
        System.out.println(c.modelo);
        System.out.println(c.cor);

        System.out.println("Meu automovel 'c' tem nome: " + c.modelo + ". Cor: " + c.cor);


    }
}
