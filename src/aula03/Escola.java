package aula03;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    protected String nome;

    protected List<Turma> turmas;

    protected List<Aluno> alunos;
    protected List<Professor> professores;
    protected List<Funcionario> funcionarios;

    public Escola(String nome){
        this.nome = nome;
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void cadastraAluno(String nome, String cpf, String rg){
        if (verificaNovoAluno(cpf)){
            Aluno aluno = new Aluno(nome, cpf, rg);
            alunos.add(aluno);
        } else {
            System.out.println("AVISO: Aluno ja cadastrado!");
        }
    }

    public void cadastraProfessor(String nome, String cpf, String rg, String cargo, String salario){
        if (verificaNovoProfessor(cpf)){
            Professor professor = new Professor(nome, cpf, rg, cargo, salario);
            professores.add(professor);
        } else {
            System.out.println("AVISO: Professor ja cadastrado!");
        }
    }

    public void cadastraFuncionario(String nome, String cpf, String rg, String cargo, String salario){
        if (verificaNovoFuncionario(cpf)){
            Funcionario funcionario = new Funcionario(nome, cpf, rg, cargo, salario);
            funcionarios.add(funcionario);
        } else {
            System.out.println("AVISO: Funcionario ja cadastrado!");
        }
    }

    public void atualizaAluno(String cpf, Aluno alunoAtualizado){
        Aluno aluno = encontraAluno(cpf);
        if (aluno != null){
            aluno = alunoAtualizado;
        }
    }

    public void atualizaProfessor(String cpf, Professor professorAtualizado){
        Professor professor = encontraProfessor(cpf);
        if (professor != null){
            professor = professorAtualizado;
        }
    }

    public void atualizaFuncionario(String cpf, Funcionario funcionarioAtualizado){
        Funcionario funcionario = encontraFuncionario(cpf);
        if (funcionario != null){
            funcionario = funcionarioAtualizado;
        }
    }

    public void removerAluno(String cpf){
        Aluno aluno = encontraAluno(cpf);
        if (aluno != null){
            alunos.remove(aluno);
        }
    }

    public void removerProfessor(String cpf){
        Professor professor = encontraProfessor(cpf);
        if (professor != null){
            professores.remove(professor);
        }
    }

    public void removerFuncionario(String cpf){
        Funcionario funcionario = encontraFuncionario(cpf);
        if (funcionario != null){
            funcionarios.remove(funcionario);
        }
    }

    public Aluno encontraAluno(String cpf){
        if (!verificaNovoAluno(cpf)){
            for (Aluno aluno: alunos){
                if (aluno.getCpf().equals(cpf)){
                    return aluno;
                }
            }
        }
        return null;
    }


    public Professor encontraProfessor(String cpf){
        if(!verificaNovoProfessor(cpf)){
            for (Professor professor: professores){
                if (professor.getCpf().equals(cpf)){
                    return professor;
                }
            }
        }
        return null;
    }

    public Funcionario encontraFuncionario(String cpf){
        if (!verificaNovoFuncionario(cpf)){
            for (Funcionario funcionario: funcionarios){
                if (funcionario.getCpf().equals(cpf)){
                    return funcionario;
                }
            }
        }
        return null;
    }

    public boolean verificaNovoAluno (String cpfNovoAluno){
        for (Aluno aluno: alunos){
            if (aluno.getCpf().equals(cpfNovoAluno)){
                return false;
            }
        }
        return true;
    }

    public boolean verificaNovoProfessor (String cpfNovoProfessor){
        for (Professor professor: professores){
            if (professor.getCpf().equals(cpfNovoProfessor)){
                return false;
            }
        }
        return true;
    }

    public boolean verificaNovoFuncionario (String cpfNovoFuncionario){
        for (Funcionario funcionario: funcionarios){
            if (funcionario.getCpf().equals(cpfNovoFuncionario)){
                return false;
            }
        }
        return true;
    }


}
