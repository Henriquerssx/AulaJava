package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        do {
            System.out.println("Escolha o que deseja:");

            System.out.println("\t1- para  Eletronicos");
            System.out.println("\t2- para Alimentos");
            System.out.println("\t3- para Vestuario");
            System.out.println("\t4- para sair");

            i = scanner.nextInt();

            switch (i) {
                case 1:
                    System.out.println(" Smartphone\nTablet\nNotebook ");
                    break;
                case 2:
                    System.out.println("Banana\nMaça\nPera");
                    break;
                case 3:
                    System.out.println("Vestido\nSaia\nCamisa");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Invalido");
            }


        } while (i != 4) ;



    }
}
