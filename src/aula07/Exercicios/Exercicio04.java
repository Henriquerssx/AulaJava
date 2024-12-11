package aula07.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius ");
        double conversao = converterCelsiusParaFahrenheit(scanner.nextDouble());
        System.out.println("A temperatura digitada em fahrenheit é: " + conversao);
    }

static double converterCelsiusParaFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32;
    }
}

