package aula05;

public class gerenciaVida {

    static void sofrerDano(int dano, tipoAtaque tipoAtaque, Personagem personagem){
        if (personagem instanceof Jogador) {
            personagem.vida -= dano;
        } else {
            Inimigos inimigo = (Inimigos) personagem;
            if (!inimigo.fraqueza.equals(tipoAtaque)){
                inimigo.vida -= dano;
            } else {
                inimigo.vida -= dano*2;
            }
        }
        estaVivo(personagem);
    }

    static void estaVivo(Personagem personagem) {
        if (personagem.vida <= 0) {
            if (personagem instanceof Inimigos) {
                System.out.println("Voce matou este inimgo.");
            } else {
                System.out.println("Voce morreu!");
            }
        }
    }


}
