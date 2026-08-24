import corporativo.Empresa;

public class EmpresaJuniorPrograma {

    public static void main(String[] args) {
        Empresa fabricaCarne = new Empresa("Fabrica de Carne de bode");

        fabricaCarne.adicionarDepartamento("Abatedouro");
        fabricaCarne.adicionarDepartamento("Financeiro");

        System.out.println("Fabrica de Carne de bode:" + fabricaCarne);
    }
}
