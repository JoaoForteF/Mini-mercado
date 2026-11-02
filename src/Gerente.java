// Aqui vai ser onde e cadastrado as opções do administrador

import java.util.Scanner;

public class Gerente extends Funcionarios {

    private Scanner entrada;
    private Estoque estoque;

    public Gerente(String nome, int matricula, Scanner entrada, Estoque estoque) {
        super(nome, matricula);
        this.entrada = entrada;
        this.estoque = estoque;
    }

    public void iniciar() {

        int opcao;

        do {

            System.out.println("    ");
            System.out.println("## AREA DO GERENTE ##");
            System.out.println("    ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar Estoque");
            System.out.println("3 - Gerar Relatorio");
            System.out.println("4 - Sair");
            System.out.println("    ");

            System.out.print("Escolha uma opção: ");
            System.out.println("    ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                cadastrarProduto();
            } else if (opcao == 2) {
                consultarEstoque();
            } else if (opcao == 3) {
                gerarRelatorio();
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

    }


    public void cadastrarProduto() {

        System.out.println("\n### CADASTRO DE PRODUTO ###");

        System.out.print("Codigo: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();

        if (estoque.buscarProduto(codigo) != null) {
            System.out.println("Esse codigo ja esta cadastrado!");
            return;
        }

        System.out.print("Nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Preco: ");
        double preco = entrada.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = entrada.nextInt();

        if (preco <= 0 || quantidade < 0) {
            System.out.println("Preco ou quantidade invalida!");
            return;
        }

        Produto produto = new Produto(codigo, nome, preco, quantidade);

        estoque.cadastrarProduto(produto);
    }
    public void consultarEstoque() {
        System.out.println("\n### CONSULTA DE ESTOQUE ###");

        estoque.listarProdutos();
    }

    public void gerarRelatorio() {

        estoque.gerarRelatorio();
    }
    }
