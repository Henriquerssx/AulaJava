package aula06.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean[] trueFalse = new boolean[8];
        int qtdTrue = 0;

        for (int i = 0; i < trueFalse.length; i++) {
            System.out.print("Digite true ou false: ");
            trueFalse[i] = scanner.nextBoolean();
            if (trueFalse[i]) qtdTrue++;
        }

        System.out.println("\nVocê digitou " + qtdTrue + " true e " + (8 - qtdTrue) + " false.");

        scanner.close();
    }
}

