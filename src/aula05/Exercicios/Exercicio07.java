package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Digite a nota ");
            nota = scanner.nextInt();
            if (nota > 10 || nota < 0) {
                System.out.println("Insira um valor válido.");
            } else continue;
        } while (nota > 10 || nota < 0);
        System.out.println("A nota informada foi "
                + nota );

        scanner.close();
    }
}



