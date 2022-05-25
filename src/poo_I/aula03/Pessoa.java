package poo_I.aula03;

public abstract class Pessoa {

    protected String nome;
    protected String cpf;
    protected String rg;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome  +
                " - CPF: " + cpf  +
                " - RG: " + rg;
    }
}
