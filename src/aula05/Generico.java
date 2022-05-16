package aula05;

public class Generico extends Inimigos {

    public Generico() {
        this.vida = 50;
        this.fraqueza = null;
    }

    @Override
    void atacar() {
        System.out.println("Causou 10 de dano!");
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        System.out.println("Recebeu" + danoRecebido + "de dano");
        gerenciaVida.sofrerDano(danoRecebido, tipoAtaque, this);
    }

    @Override
    void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
