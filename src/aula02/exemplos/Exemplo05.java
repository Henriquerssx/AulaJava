package aula02.exemplos;
import java.util.Scanner;

public class Exemplo05 {
    public static void main(Exemplo08[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero = scanner.nextInt();
        long varLong = numero;
        float varFloat = numero;
        double varDouble = numero;
        System.out.println("O numero é " + numero);
        System.out.println( "varLong é " + varLong);
        System.out.println(" varFloat é " + varFloat);
        System.out.println(" varDouble é " + varDouble);
        System.out.println("Digite um numero decimal ");
        varFloat = scanner.nextFloat();
        System.out.println("voce digitou: " + varFloat);

        varDouble = varFloat;
        System.out.println("varDouble= " +varFloat);
    scanner.close();

    }
}
