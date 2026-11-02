//

import java.util.Scanner;

public class Mercadinho {

    Scanner entrada = new Scanner(System.in);
    Estoque estoque = new Estoque();
    Gerente gerente = new Gerente("Joao", 101, entrada, estoque);
    Atendente atendente = new Atendente("Maria", 102, entrada,estoque);

    public void iniciar() {
        int matricula;
        String senha;

        do {

            System.out.println("\n### LOGIN DO SISTEMA ###");
            System.out.println("Digite (0) na matricula caso queira finalizar o sistema.");

            System.out.print("\nMatricula: ");
            matricula = entrada.nextInt();
            entrada.nextLine();

            if (matricula == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            System.out.print("Senha: ");
            senha = entrada.nextLine();

            if (matricula == 101 && senha.equals("1234")) {

                System.out.println("\nBem-vindo, " + gerente.getNome() + "!");
                gerente.iniciar();

            } else if (matricula == 102 && senha.equals("5678")) {

                System.out.println("\nBem-vindo, " + atendente.getNome() + "!");
                atendente.iniciar();

            } else {

                System.out.println("\nMatricula ou senha incorreta!");

            }

        } while (true);

    }
}