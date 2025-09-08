public class Aluno {

    private String nome;
    private int idade;
    private Curso curso;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void exibirInfo() {
        System.out.println("Aluno: " + nome + " | " + "Idade: " + idade);
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome()
                    + " | Carga horária: " + curso.getCargaHoraria() + "h");
            if (curso.getProfessor() != null) {
                System.out.println("Professor: " + curso.getProfessor().getNome() + " | "
                        + "Especialidade: " + curso.getProfessor().getEspecialidade());
            }

        } else {
            System.out.println("Nenhum curso associado.");
        }
        System.out.println("------------------------");
    }
}
