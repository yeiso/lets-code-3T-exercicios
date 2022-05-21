package aula05;

public abstract class Personagem {

    protected int vida;
    protected int forcaAtaque;
    protected tipoAtaque tipoAtaque;
    protected tipoAtaque fraqueza;

    abstract void atacar(Personagem personagem);
    abstract void apanhar(int danoRecebido, tipoAtaque tipoAtaque);

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public tipoAtaque getFraqueza() {
        return fraqueza;
    }
}
