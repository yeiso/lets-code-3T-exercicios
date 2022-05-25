package poo_I.aula05;

public class Aula05 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Tester");
        Gigante gigante1 = new Gigante();
        Cobra cobra1 = new Cobra();
        Vampiro vampiro1 = new Vampiro();
        Generico generico1 = new Generico();

        jogador1.atacar(cobra1);
        gigante1.atacar(jogador1);

    }
}
