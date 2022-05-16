package aula05;

public class Cobra extends Inimigo{

    public Cobra(){
      this.vida = 50;
      this.fraqueza = tipoAtaque.PERFURANTE;
    }

    @Override
    void atacar(int danoAtaque, tipoAtaque tipoAtaque, Personagem personagem) {
        gerenciaVida.calcularDano(danoAtaque, tipoAtaque.VENENO, personagem);
        System.out.println("Causou "+ danoAtaque +" de dano!");
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        System.out.println("Recebeu" + danoRecebido + "de dano");
        gerenciaVida.calcularDano(danoRecebido, tipoAtaque,this);
    }

    @Override
    void interagir() {
        System.out.println("Se você acender a chama a maldição acaba.");
    }

}
