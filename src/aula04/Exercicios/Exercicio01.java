package aula04.Exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade");

        int idade;
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
        }
        scanner.close();
    }
}
