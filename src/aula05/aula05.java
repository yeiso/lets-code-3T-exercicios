package aula05;

public class aula05 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Tester");
        Gigante gigante1 = new Gigante();
        Cobra cobra1 = new Cobra();
        Vampiro vampiro1 = new Vampiro();
        Generico generico1 = new Generico();

        jogador1.atacar(20, tipoAtaque.FOGO, cobra1);
        gigante1.atacar(30, tipoAtaque.PANCADA, jogador1);
        System.out.println(jogador1.getVida());
    }
}
