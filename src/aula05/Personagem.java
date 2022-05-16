package aula05;

public abstract class Personagem {

    int vida;
    protected tipoAtaque fraqueza;

    abstract void atacar(int danoAtaque,tipoAtaque tipoAtaque, Personagem personagem);
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
