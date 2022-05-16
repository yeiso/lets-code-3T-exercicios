package aula05;

public class Gigante extends Inimigo {

    public Gigante() {
        this.vida = 300;
        this.fraqueza = tipoAtaque.FOGO;
    }

    @Override
    void atacar(int danoAtaque, tipoAtaque tipoAtaque, Personagem personagem) {
        gerenciaVida.calcularDano(danoAtaque, tipoAtaque.PANCADA, personagem);
        System.out.println("Causou "+ danoAtaque +" de dano!");
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        System.out.println("Recebeu" + danoRecebido + "de dano");
        gerenciaVida.calcularDano(danoRecebido, tipoAtaque, this);
    }

    @Override
    void interagir() {
        System.out.println("Me desculpe.");
    }
}


