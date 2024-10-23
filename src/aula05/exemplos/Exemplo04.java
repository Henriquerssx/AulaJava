package aula05.exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("\t1- para  opção 1");
            System.out.println("\t2- para opção 2");
            System.out.println("\t3- para opção 3");
            System.out.println("\t4- para sair");


            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Parabens vc escolheu 1");
                    break;
                case 2:
                    System.out.println("Parabens vc escolheu 2");
                    break;
                case 3:
                    System.out.println("Parabens vc escolheu 3");
                    break;
                case 4:
                    System.out.println("valeu");
                    break;
                default:
                    System.out.println("Invalido");   }

        } while (opcao != 4);


    }
}
