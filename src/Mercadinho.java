// inicialização do sistema

import java.util.Scanner;

public class Mercadinho {

    Scanner entrada = new Scanner(System.in);
    Gerente gerente = new Gerente();
    Atendente funcionario = new Atendente();

    public void iniciar() {

        System.out.println("    ");
        System.out.println("Olá, Bom dia!!");
        System.out.println("Qual Será o Primeiro Passo?");
        System.out.println("    ");
        System.out.println("1 - Execultar como Administrador");
        System.out.println("2 - Iniciar o Expediente");
        System.out.println("    ");

        System.out.print("Escolha uma opção: ");
        System.out.println("    ");

        int opcao = entrada.nextInt();

        if(opcao==1) {

            System.out.println("Você iniciou o sistema como ADM!!");
            gerente.iniciar();
        }
        else if(opcao==2){
            System.out.println("    ");
            System.out.println("Você Está IniciandO o Expediente!!");
            funcionario.iniciar();
            }
        else{
            System.out.println("Essa opção e invalida!!");
        }


    }

}