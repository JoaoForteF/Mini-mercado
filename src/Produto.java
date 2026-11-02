// AQUI A SERA DEFINIDO AS CARACTERISTICAS DOS PRODUTOS

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int ConsultarCodigo() {
        return codigo;
    }

    public String ConsultarNome() {
        return nome;
    }

    public double ConsultarPreco() {
        return preco;
    }
}