package aula05;

public class Gigante extends Inimigo {

    public Gigante() {
        this.vida = 300;
        this.forcaAtaque = 25;
        this.tipoAtaque = aula05.tipoAtaque.PANCADA;
        this.fraqueza = aula05.tipoAtaque.FOGO;
    }

    @Override
    void atacar(Personagem personagem) {
        gerenciaVida.calcularDano(this.forcaAtaque, this.tipoAtaque , personagem);
        System.out.println("Gigante causou "+ this.forcaAtaque +" de dano!");
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


