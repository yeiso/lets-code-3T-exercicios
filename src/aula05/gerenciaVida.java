package aula05;

public class gerenciaVida {

    static void calcularDano(int dano, tipoAtaque tipoAtaque, Personagem personagem){
        if (personagem.getFraqueza() != null && personagem.getFraqueza().equals(tipoAtaque)){
            System.out.println("Ataque critico. Dano dobrado!");
            personagem.setVida(personagem.getVida() - (dano * 2));
        } else {
            personagem.setVida(personagem.getVida() - dano);
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
                System.out.println("SEU STATUS E " + ((Jogador) personagem).getStatus());
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
