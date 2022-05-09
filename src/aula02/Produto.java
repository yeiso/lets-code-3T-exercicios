package aula02;

public class Produto {

    static private int nextId = 0;
    private int id;
    private String nome;
    private int quantidade;
    private String tipo;
    private String marca;
    private Enum<sessao> sessaoProduto;
    private Estoque estoqueProduto;

    public Produto(String nome, int quantidade, String tipo, String marca, Enum<sessao> sessaoProduto, Estoque estoqueProduto) {
        this.id = nextId;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.marca = marca;
        this.sessaoProduto = sessaoProduto;
        this.estoqueProduto = estoqueProduto;
        nextId++;
    }

    void addQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    void removeQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }

    void updateNome(Produto produto, String nome){
        this.nome = nome;
    }

    void updateMarca(Produto produto, String marca){
        this.marca = marca;
    }

    void updateTipo(Produto produto, String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto " +
                "id:" + id +
                ", nome:'" + nome + '\'' +
                ", quantidade:" + quantidade +
                ", tipo:" + tipo +
                ", marca:'" + marca + '\'' +
                ", Sessao Produto: " + sessaoProduto +
                '\n';
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getMarca() {
        return marca;
    }
}
