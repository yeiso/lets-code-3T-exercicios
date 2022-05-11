package aula03;

import java.util.Map;

public class Aula03 {
    public static void main(String[] args) {

        Turma turma1a = new Turma(1, 'A', 25);
        Aluno aluno1 = new Aluno("Joao Gilberto", "11111111", "1112222", turma1a);
        Aluno aluno2 = new Aluno("Ana Maria", "11111111", "1112222", turma1a);

        turma1a.addAlunoATurma(aluno1);
        turma1a.addAlunoATurma(aluno2);
        turma1a.listarAlunosTurma();

        aluno1.addNotas(disciplina.MATEMATICA, 7.5, 8.0, 9);
        aluno1.addNotas(disciplina.FISICA, 6.5, 7.0, 7);
        aluno1.imprimirMedia();


    }
}
