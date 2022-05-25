package poo_I.aula01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Jogador {

    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmerelos;
    int cartoesVermelhos;
    Boolean suspenso = false;
    Boolean treinou = false;

    public Jogador(){}

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int cartoesAmerelos, int cartoesVermelhos) {
        Random random = new Random();

        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = random.nextInt(100)+1;
        this.cartoesAmerelos = cartoesAmerelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    Boolean podeJogar(){
        if (this.cartoesAmerelos >= 3 || this.cartoesVermelhos > 0){
            this.suspenso = true;
            return false;
        } else {
            return true;
        }
    }

    void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmerelos += quantidade;

        podeJogar();
    }

    void aplicarCartaoVermelho(){
        this.cartoesVermelhos = 1;

        podeJogar();
    }

    void cumprirSuspensao(){

        this.suspenso = false;
        this.cartoesVermelhos = 0;
        this.cartoesAmerelos = 0;
    }

    void executarTreinamento(){
        if (!this.treinou){
            Random random = new Random();
            this.qualidade += random.nextInt(3)+1;
            this.treinou = true;
        } else {
            System.out.println("Treino já realizado.");
        }
    }

    void descansar(){
        if (this.treinou) {
            this.treinou = false;
        } else {
            System.out.println("Treino ainda nao realizado");
        }
    }


    void sofrerLesao(){
        Random random = new Random();
        int nivelLesao = random.nextInt(100)+1;
        if (nivelLesao <= 5){
            if((int) (this.qualidade*0.85) > 0){
                this.qualidade = (int) (this.qualidade*0.85);
            } else {
                this.qualidade = 1;
            }
        } else if (nivelLesao <= 15){
            if((int) (this.qualidade*0.90) > 0) {
                this.qualidade = (int) (this.qualidade * 0.90);
            } else {
                this.qualidade = 1;
            }
        } else if (nivelLesao <= 30){
            if((int) (this.qualidade*0.95) > 0) {
                this.qualidade = (int) (this.qualidade * 0.95);
            } else {
                this.qualidade = 1;
            }
        } else if (nivelLesao <= 60){
            if(this.qualidade - 2 > 0) {
                this.qualidade -= 2;
            } else {
                this.qualidade = 1;
            }
        } else {
            if(this.qualidade - 1 > 0) {
                this.qualidade -= 1;
            } else {
                this.qualidade = 1;
            }
        }
    }

    String infoJogador() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.posicao + ": " + this.numero + " - " + this.nome + " (" + this.apelido + ") - " +
                "Qualidade: "+ this.qualidade + " - " + this.dataNascimento.format(formatoData) + " - CONDICAO: " +
                (this.podeJogar()? "PODE JOGAR" : "SUSPENSO") +
                " - Cartoes amarelos: "+ this.cartoesAmerelos + " - Cartao Vermelho: " + this.cartoesVermelhos + "\n";
    }

    @Override
    public String toString(){
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.posicao + ": " + this.numero + " - " + this.nome + " (" + this.apelido + ") " + " - " + this.dataNascimento.format(formatoData) + " - " + " CONDICAO: " + (this.podeJogar()? "PODE JOGAR" : "SUSPENSO") + "\n";
    }

}
