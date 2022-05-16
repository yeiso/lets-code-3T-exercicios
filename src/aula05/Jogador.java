package aula05;

public class Jogador extends Personagem{

    protected String nome;
    protected status status;

    public Jogador(String nome){
        this.nome = nome;
        this.vida = 150;
        this.status = status.NORMAL;
        this.fraqueza = null;
    }

    @Override
    void atacar(int danoAtaque, tipoAtaque tipoAtaque, Personagem personagem) {
        gerenciaVida.calcularDano(danoAtaque, tipoAtaque, personagem);
    }

    @Override
    void apanhar(int danoRecebido, tipoAtaque tipoAtaque) {
        gerenciaVida.calcularDano(danoRecebido, tipoAtaque, this);
    }

    protected void setStatus(status status) {
        this.status = status;
    }

    protected void setFraqueza(tipoAtaque fraqueza) {
        this.fraqueza = fraqueza;
    }

    public status getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }
}
