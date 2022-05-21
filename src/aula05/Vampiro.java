package aula05;

public class Vampiro extends Inimigo {

    public Vampiro() {
        this.vida = 100;
        this.forcaAtaque = 20;
        this.tipoAtaque = aula05.tipoAtaque.PERFURANTE;
        this.fraqueza = aula05.tipoAtaque.PERFURANTE;
    }

    @Override
    void atacar(Personagem personagem) {
        gerenciaVida.calcularDano(this.forcaAtaque, this.tipoAtaque , personagem);
        System.out.println("Vampiro causou "+ this.forcaAtaque +" de dano!");
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        System.out.println("Recebeu" + danoRecebido + "de dano");
        gerenciaVida.calcularDano(danoRecebido, tipoAtaque,this);
    }

    @Override
    void interagir() {
        System.out.println("O que é um homem?");
    }
}
