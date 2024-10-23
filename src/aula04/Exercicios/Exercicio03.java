package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {


        System.out.println("Escolha o que deseja:");
        System.out.println("\t1- para  Eletronicos");
        System.out.println("\t2- para Alimentos");
        System.out.println("\t3- para Vestuario");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("Smartphone\nTablet\nNotebook");
                break;
            case 2:
                System.out.println("Banana\nMaça\nPera");
                break;
            case 3:
                System.out.println("Vestido\nSaia\nCamisa");
                break;
            default:
                System.out.println("Invalido");
                scanner.close();


        }    }
}
