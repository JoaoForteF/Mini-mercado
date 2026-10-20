// Aqui vai ser onde e cadastrado as opções do administrador


import java.util.Scanner;

public class Gerente {
    Scanner entrada = new Scanner(System.in);
    public void iniciar() {
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
        int opcao = entrada.nextInt();

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

    }


    public void cadastrarProduto() {
        System.out.println("Cadastro de produto");
    }

    public void consultarEstoque() {
        System.out.println("Consulta de estoque");
    }

    public void gerarRelatorio() {
        System.out.println("Geração de relatório");
    }
}
