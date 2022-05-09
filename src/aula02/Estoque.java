package aula02;

import java.util.ArrayList;
import java.util.List;

class Estoque {

    static private int nextId = 0;
    public String nome;
    private List<Produto> produtos = new ArrayList<>();
    int id;

    public Estoque(String nome) {
        this.nome = nome;
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "Estoque: " +
                "nome='" + nome + '\'' +
                ", id=" + this.id;
    }

    public int getId() {
        return id;
    }

    void listaProdutos(){
        System.out.println(produtos.toString());
    }

    void addProduto(Produto novoProduto){
        int indexNoEstoque = indiceExisteNoEstoque(novoProduto);
        if (indexNoEstoque > -1){
            produtos.get(indexNoEstoque).addQuantidade(novoProduto.getQuantidade());
        } else {
            produtos.add(novoProduto);
        }
    }

    void removeProduto (Produto produto){
        int indexNoEstoque = indiceExisteNoEstoque(produto);
        if (indexNoEstoque > -1){
            produtos.get(indexNoEstoque).removeQuantidade(produto.getQuantidade());
            produtos.remove(produto);
        } else {
            System.out.println("Produto nao encontrado");
        }
    }

    int indiceExisteNoEstoque(Produto produto) {
         for (int i = 0; i < this.produtos.size(); i++) {
                if (produto.getNome().equalsIgnoreCase(produtos.get(i).getNome()) && produto.getMarca().equalsIgnoreCase(produtos.get(i).getMarca())) {
                    return produtos.indexOf(produtos.get(i));
                }
            }
         return -1;

    }
}
