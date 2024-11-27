package aula06.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas;
        int[] vetor = new int[5];
        System.out.println("Digite a primeira nota");
        vetor[0] = scanner.nextInt();
        System.out.println("Digite a segunda nota");
        vetor[1] = scanner.nextInt();
        System.out.println("Digite a terceira nota");
        vetor[2] = scanner.nextInt();
        System.out.println("Digite a quarta nota");
        vetor[3] = scanner.nextInt();
        System.out.println("Digite a quinta nota");
        vetor[4] = scanner.nextInt();


        notas = (vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4]) / 5;
        System.out.println("A sua média foi " + notas);



    }
}
