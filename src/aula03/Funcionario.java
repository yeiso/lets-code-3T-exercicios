package aula03;

public class Funcionario extends Pessoa{

    protected String cargo;
    protected String salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, String salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }
}
