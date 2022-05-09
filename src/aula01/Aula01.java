package aula01;

import java.time.LocalDate;

public class Aula01 {
    public static void main(String[] args) {

        Time time = new Time("LetsCode F.C.");
        Jogador jogador1 = new Jogador(1, "Joao Pedro", "JP", LocalDate.of(2000,11,11), 1, "Goleiro",  0, 0);
        time.jogadores.add(jogador1);
        Jogador jogador2 = new Jogador(2, "Derek Weber", "Pluto", LocalDate.of(1998,1,12), 2, "Zagueiro",  0, 0);
        time.jogadores.add(jogador2);
        Jogador jogador3 = new Jogador(3, "Luis Schmidt", "Elvis", LocalDate.of(1994,8,5), 3, "Zagueiro",  0, 0);
        time.jogadores.add(jogador3);
        Jogador jogador4 = new Jogador(4, "Victor Silva", "Ajax", LocalDate.of(1989,12,7), 5, "Lateral",  0, 0);
        time.jogadores.add(jogador4);
        Jogador jogador5 = new Jogador(5, "Carlos Cohen", "Chico", LocalDate.of(1996,1,9), 4, "Lateral",  0, 0);
        time.jogadores.add(jogador5);
        Jogador jogador6 = new Jogador(6, "Alex Torres", "Yoda", LocalDate.of(1985,3,22), 7, "Volante",  0, 0);
        time.jogadores.add(jogador6);
        Jogador jogador7 = new Jogador(7, "Antonio Greene", "Green", LocalDate.of(1985,5,26), 8, "Meio Campo",  0, 0);
        time.jogadores.add(jogador7);
        Jogador jogador8 = new Jogador(8, "George Mills", "Gus", LocalDate.of(1992,7,28), 9, "Meio Campo",  0, 0);
        time.jogadores.add(jogador8);
        Jogador jogador9 = new Jogador(9, "Joel Elliott", "Jess", LocalDate.of(1997,9,15), 6, "Meio Campo",  0, 0);
        time.jogadores.add(jogador9);
        Jogador jogador10 = new Jogador(10, "Gabriel Matthews", "Zero", LocalDate.of(1982,7,30), 10, "Atacante",  0, 0);
        time.jogadores.add(jogador10);
        Jogador jogador11 = new Jogador(11, "Brett Pierce", "Chili", LocalDate.of(1989,8,28), 11, "Atacante",  0, 0);
        time.jogadores.add(jogador11);


        //System.out.println(time.listaTime());

        System.out.println(jogador1.infoJogador());
        jogador1.executarTreinamento();
        jogador1.descansar();
        jogador1.executarTreinamento();
        System.out.println(jogador1.infoJogador());
        jogador1.sofrerLesao();
        System.out.println(jogador1.infoJogador());
    }
}
