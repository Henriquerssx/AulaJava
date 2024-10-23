package aula05.exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        //laço de repetição
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        while (idade < 18) {
            System.out.println("Digite sua idade");
            idade = scanner.nextInt();
            System.out.println("Para acessar é preciso ter alcançado a maioridade");}

        System.out.println("Voce e maior de idade");
        scanner.close();
    }
}
