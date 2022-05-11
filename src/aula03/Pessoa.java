package aula03;

public class Pessoa {

   private String nome;
   private String cpf;
   private String rg;

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
