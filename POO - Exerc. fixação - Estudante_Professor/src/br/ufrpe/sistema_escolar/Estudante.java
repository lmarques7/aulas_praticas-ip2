package br.ufrpe.sistema_escolar;

public class Estudante extends Pessoa {

    private int numCursos;
    private String[] cursos;
    private double[] notas;
    
    public Estudante(String nome, String endereco) {
        super(nome, endereco);
        
        this.numCursos = 0;
        this.cursos = new String[20];
        this.notas = new double[20];
    }
    
    public boolean addCursoNota(String curso, double nota) {
        boolean adicionar = true;
        for (int i = 0; i < this.numCursos && adicionar; i++) {
            if (this.cursos[i].equals(curso)) {
                adicionar = false;
            }
        }
        
        if (adicionar) {
            this.cursos[this.numCursos] = curso;
            this.notas[this.numCursos] = nota;
            this.numCursos++;
        }
        return adicionar;
    }
    
    public double getNotaMedia() {
        double resultado = 0;
        for (int i = 0; i < this.numCursos; i++) {
            resultado += this.notas[i];
        }
        if (this.numCursos > 0) {
            resultado = resultado / this.numCursos;
        }
        return resultado;
    }
    
    @Override
    public String toString() {
        String resultado = super.toString() + " - ESTUDANTE\n";
        
        for (int i = 0; i < this.numCursos; i++) {
            resultado += "\tCurso: " + this.cursos[i] + ". Nota: " + this.notas[i] + "\n";
        }
        
        return resultado;
    }
    
    public void imprimeNotas() {
        System.out.println(this.toString());
    }

    /**
     * @return the numCursos
     */
    public int getNumCursos() {
        return numCursos;
    }

    /**
     * @return the cursos
     */
    public String[] getCursos() {
        return cursos;
    }
}
