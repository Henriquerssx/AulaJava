package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Horas trabalhadas");

        float valorDaHora = 15;
        float horas = scanner.nextFloat();

        if (horas > 40) {

            float horasExtras = horas - 40;
            float valor = horasExtras * (valorDaHora * 1.5f);
            System.out.println(valor);
            }else {
            System.out.println(horas * valorDaHora );


            scanner.close();
        }
    }
}
