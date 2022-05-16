package aula05;

public abstract class Inimigos extends Personagem{

    protected tipoAtaque fraqueza;

    abstract void atacar();
    abstract void apanhar(int danoRecebido, tipoAtaque tipoAtaque);
    abstract void interagir();

}
