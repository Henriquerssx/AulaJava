package aula04.exemplos;
import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
//estrutura de decisão
        Scanner scanner = new Scanner(System.in);
    int x;
        System.out.println("Digite um número");
    x = scanner.nextInt();
    if (x >= 30 ) {
        System.out.println("Número maior ou igual a 30");
    }else {
        System.out.println("Número menor que 30");}
        scanner.close();


}
}