package aula05.exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        do {
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
        }  while (idade < 18);
        System.out.println("Voce e maior de idade");
        scanner.close();
    }
}


