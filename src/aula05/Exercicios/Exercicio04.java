package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //errado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um num");
        int num = scanner.nextInt();

        Boolean primo;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println("primo");
         if (num <= 1) {
            System.out.println("n é primo");}
        scanner.close();

    }
}
