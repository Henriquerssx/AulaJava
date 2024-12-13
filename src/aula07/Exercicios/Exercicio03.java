package aula07.Exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fale um número");
        int parametro1 = scanner.nextInt();
        System.out.print("Fale um número");
        int parametro2 = scanner.nextInt();

        int dobro = dobrar(parametro1,parametro2);
        System.out.println();
        System.out.println(dobro);}

    static int dobrar (int parametro1, int parametro2 ){
        return parametro1 * parametro2;

    }
}

