package aula06.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean verificar = false;
        String nome;
        System.out.println("Digite um nome");
        nome = scanner.nextLine();

        String[] nomes = {"Henrique", "Jose", "Rafael"};
        for (int vetor = 0; vetor < nomes.length; vetor++) {

            if (nomes[vetor].equals(nome)) {
                verificar = true;
                break;
            }
        }
        if (verificar) {
            System.out.println("Existe esse nome no vetor");
        } else {
            System.out.println("Não existe esse nome no vetor");
        }
        scanner.close();
    }
}
