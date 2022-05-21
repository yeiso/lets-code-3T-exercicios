package aula05;

public class Generico extends Inimigo {

    public Generico() {
        this.vida = 50;
        this.forcaAtaque = 10;
        this.tipoAtaque = aula05.tipoAtaque.NORMAL;
        this.fraqueza = null;
    }

    @Override
    void atacar(Personagem personagem) {
        gerenciaVida.calcularDano(this.forcaAtaque, this.tipoAtaque , personagem);
        System.out.println("Generico causou "+ this.forcaAtaque +" de dano!");
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
