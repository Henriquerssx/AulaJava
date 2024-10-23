package aula02.exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        var numero1 =5;
        var numero2 =23;
        boolean resposta;

        resposta=numero1>numero2;
        System.out.println("o primeiro numero é maior que o segundo ? " +resposta);

        resposta = numero1<numero2;
        System.out.println("O primeiro numero é menor que o segundo ? " + resposta);

         resposta= numero1>=numero2;
        System.out.println("O primeiro numero é maior ou igual o segundo ? " + resposta);

         resposta = numero1<=numero2;
        System.out.println("O primeiro numero é menor ou igual o segundo ? " + resposta);

        resposta = numero1==numero2;
        System.out.println("O primeiro numero é igual o segundo ? " + resposta);

        resposta = numero1!=numero2;
        System.out.println("O primeiro numero é diferente do segundo ? " + resposta);

    }
}