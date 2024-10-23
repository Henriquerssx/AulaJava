package aula04.Exemplos;


import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
//ternario
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o valor da compra ");
        float valorCompra = scanner.nextFloat();
        float valorTotal, desconto = 0.2f;

        valorTotal = valorCompra > 100.0f ? valorCompra - valorCompra * desconto : valorCompra;
        System.out.println("O valor da compra é: "+ valorTotal);

}
}
