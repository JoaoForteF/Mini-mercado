//SERÁ RESPONSAVEL PELA PARTE DE ATENDIMENTO AO CLIENTE.

import java.util.Scanner;

public class Atendente extends Funcionarios {

    private Scanner entrada;
    private Estoque estoque;

    public Atendente(String nome, int matricula, Scanner entrada, Estoque estoque) {
        super(nome, matricula);
        this.entrada = entrada;
        this.estoque = estoque;
    }

    public void iniciar() {

        int opcao;

        do {

            double totalCompra = 0;
            int codigo;

            System.out.println("\n ### AREA DO ATENDENTE ###");
            System.out.println("\n1 - Iniciar atendimento");
            System.out.println("2 - Voltar ao menu inicial");

            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {

                do {

                    System.out.print("\nInsira o codigo do produto (0 para finalizar): ");
                    codigo = entrada.nextInt();

                    if (codigo != 0) {

                        Produto produto = estoque.buscarProduto(codigo);

                        if (produto != null) {

                            if (produto.returnQuantidade() > 0) {

                                double preco = produto.returnPreco();

                                produto.defineQuantidade(produto.returnQuantidade() - 1);

                                totalCompra += preco;

                                System.out.println("Produto: " + produto.getNome());
                                System.out.printf("Preco: R$ %.2f%n", preco);
                                System.out.println("Produto adicionado!");

                            } else {
                                System.out.println("Produto sem estoque!");
                            }

                        } else {
                            System.out.println("Produto nao encontrado!");
                        }
                    }

                } while (codigo != 0);

                System.out.println("\n===== EXTRATO TOTAL =====");
                System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
                System.out.println("Compra finalizada!");

            } else if (opcao == 2) {

                System.out.println("Voltando ao menu inicial...");

            } else {

                System.out.println("Opcao invalida!");

            }

        } while (opcao != 2);
    }
}

