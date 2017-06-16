package br.ufrpe.sistema_escolar;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        
        Estudante e1 = new Estudante("Leandro", "Rua da hora");
        e1.addCursoNota("Física Nuclear", 9.875);
        e1.addCursoNota("Física quântica", 8.654);
        e1.addCursoNota("Computação", 7.56);
        
        Estudante e2 = new Estudante("José", "Ali perto");
        e2.addCursoNota("Física Nuclear", 1.2);
        e2.addCursoNota("Computação", 2.345);
        e2.addCursoNota("História", 9.82);
        
        Estudante e3 = new Estudante("Bruna", "Longe");
        e3.addCursoNota("Física Nuclear", 9.99);
        e3.addCursoNota("Física quântica", 9.99);
        e3.addCursoNota("Programação", 10);
        
        Professor p1 = new Professor("Einstein", "Alemanha");
        p1.addCurso("Física Nuclear");
        p1.addCurso("Física quântica");
        
        Professor p2 = new Professor("Bill Gates", "EUA");
        p2.addCurso("Computação");
        p2.addCurso("Programação");
        
        Professor p3 = new Professor("Lula", "Brasil");
        p3.addCurso("História");
        
        Pessoa[] pessoas = {e1, p1, e2, p2, e3, p3};
        
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        System.out.println(listarTurmas(pessoas));
        
    }
    
    public static String listarTurmas(Pessoa[] pessoas) {
        StringBuffer buffer = new StringBuffer();
        
        ArrayList<Professor> profs = new ArrayList<>();
        ArrayList<Estudante> estuds = new ArrayList<>();
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Professor) {
                profs.add((Professor) pessoa);
            } else if (pessoa instanceof Estudante) {
                estuds.add((Estudante)pessoa);
            }
        }
        
        for (Professor prof : profs) {
            for (int i = 0; i < prof.getNumCursos(); i++) {
                String cursoCorrente = prof.getCursos()[i];
                
                buffer.append("Curso: " + cursoCorrente + "\n");
                buffer.append("Professor: " + prof.getNome() + "\n");
                
                for (Estudante estudante : estuds) {
                    for (int j = 0; j < estudante.getNumCursos(); j++) {
                        if (estudante.getCursos()[j].equals(cursoCorrente)) {
                            buffer.append("\tEstudante: " + estudante.getNome() + "\n");
                        }
                    }
                }
                
            }
        }
        
        return buffer.toString();
    }

}
