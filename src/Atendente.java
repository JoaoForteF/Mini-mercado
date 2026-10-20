//SERÁ RESPONSAVEL PELA PARTE DE ATENDIMENTO AO CLIENTE.

import java.util.Scanner;

public class Atendente {

    Scanner entrada = new Scanner(System.in);


    public void iniciar() {

        int op =0;

        System.out.println("    ");
        System.out.println("## AREA DO ATENDENTE ##");
        System.out.println("    ");

        do {

            System.out.println("Insira o Codigo do Produto:");
            int opcao = entrada.nextInt();

            System.out.println("O que Vamos Fazer Agora?");
            System.out.println("    ");
            System.out.println("Proximo Produto? (Digite o codigo do produto)");
            System.out.println("    ");
            System.out.println("Extrato Total? (Digite 0)");
            System.out.println("    ");
            op = entrada.nextInt();

        } while(op !=0 );
    }

}
