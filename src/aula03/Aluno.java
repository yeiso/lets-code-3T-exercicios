package aula03;

import java.util.*;

public class Aluno extends Pessoa {

    Turma turma;
    Map<disciplina, Notas> notasPorMateria = new HashMap<>();

    public Aluno(String nome, String cpf, String rg, Turma turma) {
        super(nome, cpf, rg);
        this.turma = turma;
    }

    public void imprimirMedia(){
        System.out.println("ALUNO: " + this.getNome());
        Set materias = this.notasPorMateria.keySet();
        for (Object materia: materias) {
            OptionalDouble media = Arrays.stream(this.notasPorMateria.get(materia).notas).average();
            System.out.printf("%-10s - Media: %.2f %n", materia, media.getAsDouble());
        }
    }

    void addNotas(disciplina disciplina, double nota1, double nota2, double nota3){
        this.notasPorMateria.put(disciplina, new Notas(nota1, nota2, nota3));
    }

    @Override
    public String toString() {
        return super.toString() + this.turma.getTurma();
    }

}
