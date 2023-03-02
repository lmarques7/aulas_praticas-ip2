package br.ufrpe.academico.exceptions;

import br.ufrpe.academico.models.Aluno;

public class AlunoMenorDeIdadeException extends Exception {
    
    private Aluno aluno;
    
    public AlunoMenorDeIdadeException (Aluno alunoMenorDeIdade) {
        super("Aluno menor de idade detectado. Nome: " + alunoMenorDeIdade.getNome());
    }

}
