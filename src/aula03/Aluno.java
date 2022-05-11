package aula03;

import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa {

    String turma;
    Map<disciplina, Notas> notasPorMateria = new HashMap<>();

    public Aluno(String nome, String cpf, String rg, String turma) {
        super(nome, cpf, rg);
        this.turma = turma;
    }

    public Map<disciplina, Notas> getNotasPorMateria() {
        return notasPorMateria;
    }

    public void setNotasPorMateria(Map<disciplina, Notas> notasPorMateria) {
        this.notasPorMateria = notasPorMateria;
    }

    public void addNotasPorMateria(Map<disciplina, Notas> notasPorMateria){
        this.notasPorMateria.put(<disciplina, Notas>);
    }
}
