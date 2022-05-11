package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Turma {

    private int ano;
    private char classe;
    private int sala;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public Turma(int ano, char classe, int sala) {
        this.ano = ano;
        this.classe = classe;
        this.sala = sala;
    }

    void addAlunoATurma(Aluno aluno){
        this.alunos.add(aluno);
    }

    void addProfessorATurma(Professor professor){
        this.professores.add(professor);
    }

    void listarAlunosTurma(){
        for (Aluno aluno: alunos) {
            System.out.println(aluno.toString());
        }
    }

    String getTurma(){
        return " - Turma: " + this.ano + "-" + this.classe + " SALA: " + this.sala;
    }

}
