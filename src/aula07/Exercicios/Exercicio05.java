package aula07.Exercicios;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite as três notas para calcular a média");
            double media = calcularMedia(scanner.nextDouble(),
                    scanner.nextDouble(), scanner.nextDouble());
            System.out.println("A sua média foi " + media);

        }

        public static double calcularMedia ( double nota1, double nota2, double nota3){
            return (nota1 + nota2 + nota3) / 3;

    }
}
