public class SistemaAcademico {

    public static void main(String[] args) {
        Professor p = new Professor("Leandro", "Programacao");

        Curso c1 = new Curso("IP2", 60, p);

        Aluno a1 = new Aluno("Jose", 22, c1);
        Aluno a2 = new Aluno("Bruno", 26);

        a1.exibirInfo();
        a2.exibirInfo();
    }

}
