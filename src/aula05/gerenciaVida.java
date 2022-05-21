package aula05;

public class gerenciaVida {

    static void calcularDano(int dano, tipoAtaque tipoAtaque, Personagem personagem){
        tipoAtaque fraqueza = personagem.getFraqueza();
        int vida = personagem.getVida();

        if (fraqueza != null && fraqueza.equals(tipoAtaque)){
            System.out.println("Ataque critico. Dano dobrado!");
            personagem.setVida(vida - (dano * 2));
        } else {
            personagem.setVida(vida - dano);
        }
        estaVivo(personagem);

        if (personagem instanceof Jogador){
            switch (tipoAtaque){
                case VENENO     -> {
                    ((Jogador) personagem).setStatus(status.ENVENENADO);
                }
                case PANCADA    -> {
                    ((Jogador) personagem).setStatus(status.ATORDOADO);
                }
                case PERFURANTE -> {
                    ((Jogador) personagem).setStatus(status.SANGRANDO);
                }
            }
            if(!((Jogador) personagem).getStatus().equals(status.NORMAL)) {
                System.out.println(((Jogador) personagem).getNome() + " STATUS: " + ((Jogador) personagem).getStatus());
            }
        }

    }

    static void estaVivo(Personagem personagem) {
        if (personagem.vida <= 0) {
            if (personagem instanceof Inimigo) {
                System.out.println("Voce matou este inimgo.");
            } else {
                System.out.println("Voce morreu!");
            }
        }
    }


}
