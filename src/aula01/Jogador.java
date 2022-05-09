package aula01;

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
    Boolean jaTreinou = false;

    public Jogador(){}

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmerelos, int cartoesVermelhos) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmerelos = cartoesAmerelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public Boolean podeJogar(){
        if (this.cartoesAmerelos >= 3 || this.cartoesVermelhos > 0){
            this.suspenso = true;
            return false;
        } else {
            return true;
        }
    }

    public void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmerelos += quantidade;

        podeJogar();
    }

    public void aplicarCartaoVermelho(){
        this.cartoesVermelhos = 1;

        podeJogar();
    }

    public void cumprirSuspensao(){

        this.suspenso = false;
        this.cartoesVermelhos = 0;
        this.cartoesAmerelos = 0;
    }

    public void executarTreinamento(){
        if (!this.jaTreinou){
            Random random = new Random();
            this.qualidade += random.nextInt(3)+1;
            this.jaTreinou = true;
        }
    }

    public void sofrerLesao(){
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

    @Override
    public String toString(){
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.posicao + ": " + this.numero + " - " + this.nome + " (" + this.apelido + ") " + " - " + this.dataNascimento.format(formatoData) + " - " + " CONDICAO: " + (this.podeJogar()? "PODE JOGAR" : "SUSPENSO") + "\n";
    }

}
