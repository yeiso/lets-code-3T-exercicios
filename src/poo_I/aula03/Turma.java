package poo_I.aula03;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    protected int ano;
    protected char classe;
    protected int sala;
    protected List<Aluno> alunos = new ArrayList<>();
    protected List<Professor> professores = new ArrayList<>();

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

    void listarProfessoresTurma(){
        for (Professor professor: professores) {
            System.out.println(professor.toString());
        }
    }

    @Override
    public String toString(){
        return "- Turma: " + this.ano + "-" + this.classe + " SALA: " + this.sala;
    }

}
