package poo_I.aula05;

public class Cobra extends Inimigo{

    public Cobra(){
      this.vida = 50;
      this.forcaAtaque = 10;
      this.tipoAtaque = poo_I.aula05.tipoAtaque.VENENO;
      this.fraqueza = poo_I.aula05.tipoAtaque.PERFURANTE;
    }

    @Override
    void atacar(Personagem personagem) {
        gerenciaVida.calcularDano(this.forcaAtaque, this.tipoAtaque , personagem);
        System.out.println("Cobra causou "+ this.forcaAtaque +" de dano!");
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
