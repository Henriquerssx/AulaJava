package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long numero = 0;
        long fatorial = 1;
        long var = 1;
        System.out.println("Digite o número para calcular fatorial: ");
        numero = scanner.nextInt();
        do {
            fatorial *= var;
            var++;
        }  while (var <= numero);
        {
            System.out.println( "Fatorial de " + numero + " = " + fatorial);}


        scanner.close();
    }
}
