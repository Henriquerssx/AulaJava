package aula04.Exemplos;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {


        int Idade;
        Scanner scanner = new Scanner(System.in);
        while (true) {


        System.out.println("Digite a idade");
        Idade = scanner.nextInt();

        if (Idade > 0 && Idade <= 12) {
            System.out.println("Voce e criança");
        } else if (Idade > 12 && Idade <= 17) {
            System.out.println("Voce e adolescente");
        } else if (Idade > 17 && Idade < 65) {
            System.out.println("Voce e adulto");
        } else if (Idade >= 65) {
            System.out.println("Voce e idoso");
        } else {
            System.out.println("idade invalida");
        }

    }

    }
}
