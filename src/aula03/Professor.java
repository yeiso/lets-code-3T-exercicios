package aula03;


import java.util.ArrayList;
import java.util.List;

class Professor extends Funcionario{

    protected List<disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf, String rg, String cargo, String salario) {
        super(nome, cpf, rg, cargo, salario);
    }
}
