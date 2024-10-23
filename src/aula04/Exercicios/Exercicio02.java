package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor da compra? ");
        float valor = scanner.nextFloat();
        float desconto = valor * 0.10f;
        float total = valor - desconto;

        if(valor > 100) {
            System.out.println("Com o desconto de 10%, sua compra custa " + total + " reais");
        }else{
            System.out.printf("Sua compra custa " + valor + " reais" +
                    " , acima de 100 reais você terá um desconto");
        }


    }
    }


