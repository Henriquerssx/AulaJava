package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor");
        int valor = scanner.nextInt();
        float desconto;
        if (valor < 1000){
            desconto = valor < 1000 ? (float) 0.05 : 0;
            System.out.println("Comissao de 5%: " + (valor - (valor * desconto)));
        }else if (valor >= 1000 && valor <= 5000){
            desconto = valor >= 1000 && valor<= 5000 ?  (float) 0.10 : 0;
            System.out.println("comissao de 10%: " + (valor - valor * desconto));
        }else if (valor > 5000){
            desconto = valor > 5000 ? (float) 0.15 : 0;
            System.out.println("Comissao de 15%: " + (valor - valor * desconto));
        }else {
            System.out.println("Invalido");}
        scanner.close();

    }
}
