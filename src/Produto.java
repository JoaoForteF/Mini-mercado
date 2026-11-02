// AQUI A SERA DEFINIDO AS CARACTERISTICAS DOS PRODUTOS

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    private static int quantidadeprodutos = 0;

    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

        quantidadeprodutos++;
    }

    public int returncodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double returnPreco() {
        return preco;
    }

    public int returnQuantidade() {
        return quantidade;
    }

    public void defineNome(String nome) {
        this.nome = nome;
    }

    public void definePreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void defineQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public static int returnTotalProdutos() {
        return quantidadeprodutos;
    }
}
