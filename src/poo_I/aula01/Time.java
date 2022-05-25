package poo_I.aula01;

import java.util.ArrayList;
import java.util.List;

public class Time {

    String nome;
    List<Jogador> jogadores = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    String listaTime(){
        return this.jogadores.toString();
    }
}
