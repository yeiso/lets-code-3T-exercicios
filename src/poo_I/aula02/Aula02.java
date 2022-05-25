package poo_I.aula02;

public class Aula02 {
    public static void main(String[] args) {


        Estoque estoque1 = new Estoque("Estoque 1");
        Produto produto1 = new Produto("Sprite", 10, "lata","Coca-Cola", sessao.BEBIDA, estoque1);
        Produto produto3 = new Produto("Sprite", 5, "lata","Coca-Cola", sessao.BEBIDA, estoque1);
        Produto produto2 = new Produto("Fanta Uva", 10,"lata", "Coca-Cola", sessao.BEBIDA, estoque1);
        estoque1.addProduto(produto1);
        estoque1.listaProdutos();
        estoque1.addProduto(produto2);
        estoque1.addProduto(produto3);
        estoque1.addProduto(produto3);
        estoque1.listaProdutos();
        estoque1.removeProduto(produto3);
        estoque1.listaProdutos();

    }
}
