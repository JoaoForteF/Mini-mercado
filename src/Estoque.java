// ESTOQUE. SERVIRA DE BASE PARA AS CLASSES GERENTE E ATENDENTE.

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {

        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public Produto buscarProduto(int codigo) {

        for (Produto produto : produtos) {

            if (produto.returncodigo() == codigo) {
                return produto;
            }
        }

        return null;
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }

        for (Produto produto : produtos) {

            System.out.println("--------------------");
            System.out.println("Codigo: " + produto.returncodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.printf("Preco: R$ %.2f%n", produto.returnPreco());
            System.out.println("Quantidade: " + produto.returnQuantidade());
        }

        System.out.println("--------------------");
    }


    public void gerarRelatorio() {

        double Total = 0;
        int quantidade = 0;

        System.out.println("\n### RELATORIO DO ESTOQUE ###");

        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }

        for (Produto produto : produtos) {

            Total += produto.returnPreco() * produto.returnQuantidade();

            quantidade += produto.returnQuantidade();
        }

        System.out.println("Tipos de produtos cadastrados: " + produtos.size());

        System.out.println("Quantidade total de unidades: " + quantidade);

        System.out.printf("Valor total do estoque: R$ %.2f%n", Total);

        System.out.println("===============================");
    }
}
