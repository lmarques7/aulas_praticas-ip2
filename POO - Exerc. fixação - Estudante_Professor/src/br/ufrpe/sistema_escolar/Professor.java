package br.ufrpe.sistema_escolar;

public class Professor extends Pessoa {
    
    private String[] cursos;
    private int numCursos;
    
    public Professor(String nome, String endereco) {
        super(nome, endereco);
        
        this.numCursos = 0;
        this.cursos = new String[40];
    }
    
    public boolean addCurso(String curso) {
        boolean adicionar = true;
        for (int i = 0; i < this.numCursos && adicionar; i++) {
            if (this.cursos[i].equals(curso)) {
                adicionar = false;
            }
        }
        
        if (adicionar) {
            this.cursos[this.numCursos] = curso;
            this.numCursos++;
        }
        
        return adicionar;
    }
    
    public boolean removeCurso(String curso) {
        boolean removeu = false;
        
        for (int i = 0; i < this.numCursos && !removeu; i++) {
            if (this.cursos[i].equals(curso)) {
                this.cursos[i] = this.cursos[this.numCursos - 1];
                this.cursos[this.numCursos - 1] = null;
                this.numCursos--;
                removeu = true;
            }
        }
        
        return removeu;
    }
    
    @Override
    public String toString() {
        String resultado = super.toString() + " - PROFESSOR\n";
        
        for (int i = 0; i < this.numCursos; i++) {
            resultado += "Curso: " + this.cursos[i] + "\n";
        }
        
        return resultado;
    }

}
