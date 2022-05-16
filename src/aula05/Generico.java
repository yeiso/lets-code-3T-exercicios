package aula05;

public class Generico extends Inimigo {

    public Generico() {
        this.vida = 50;
        this.fraqueza = null;
    }

    @Override
    void atacar(int danoAtaque, tipoAtaque tipoAtaque, Personagem personagem) {
        gerenciaVida.calcularDano(danoAtaque, tipoAtaque.NORMAL, personagem);
        System.out.println("Causou "+ danoAtaque +" de dano!");
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        System.out.println("Recebeu" + danoRecebido + "de dano");
        gerenciaVida.calcularDano(danoRecebido, tipoAtaque, this);
    }

    @Override
    void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
