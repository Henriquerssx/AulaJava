package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção :");
        System.out.println("\t1- para a Opção 1");
        System.out.println("\t2- para a Opção 2");
        System.out.println("\t3- para a Opção 3");

        opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Voce escolheu a opção 1");
                break;
            case 2:
                System.out.println("Voce escolheu a opção 2");
                break;
            case 3:
                System.out.println("Voce escolheu a opção 3");
                break;
            default :
                System.out.println("Opção inválida!!");
            scanner.close();

        }






    }
}
