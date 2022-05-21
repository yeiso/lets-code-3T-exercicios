package aula05;

public class Jogador extends Personagem{

    protected String nome;
    protected status status;

    public Jogador(String nome){
        this.nome = nome;
        this.vida = 150;
        this.forcaAtaque = 20;
        this.tipoAtaque = aula05.tipoAtaque.NORMAL;
        this.status = aula05.status.NORMAL;
        this.fraqueza = null;
    }

    @Override
    void atacar(Personagem personagem) {
        gerenciaVida.calcularDano(this.forcaAtaque, this.tipoAtaque, personagem);
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

    protected void setTipoAtaque(tipoAtaque tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public status getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }
}
