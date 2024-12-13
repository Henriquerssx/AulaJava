package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, nota5, media = 0;
        System.out.println("Digite a primeira nota ");
        nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota ");
        nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota ");
        nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota ");
        nota4 = scanner.nextInt();
        System.out.println("Digite a quinta nota ");
        nota5 = scanner.nextInt();

        for (int divisor = 5; divisor == 5; divisor++) {
            media = (nota1 + nota2 + nota3 + nota4 + nota5) / divisor;
            break;
        }

        System.out.println("a media foi " + media);
        scanner.close();
    }
}
