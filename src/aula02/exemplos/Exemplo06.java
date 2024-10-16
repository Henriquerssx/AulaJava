package aula02.exemplos;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(Exemplo08[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um numero inteiro ");
            int varInt = scanner.nextInt();
            System.out.print("Voce digitou o numero: " + varInt);
            short varShort = (short) varInt;
            System.out.println("voce digitou: " + varShort);
            byte varByte = (byte) varShort;
            System.out.println("Voce digitou: " + varByte);

            System.out.println("Digite um numero decimal");
            double varDouble = scanner.nextDouble();
            System.out.println("O numero que vc digitou é : " + varDouble);
        scanner.close();

    }
}