public class Produto {

    int codigo;
    String nome;
    double preco;

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