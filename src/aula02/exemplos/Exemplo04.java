package aula02.exemplos;

public class Exemplo04 {

    public static void main(Exemplo04[] args) {
        //operadores logicos
        int num1 = 2, num2 = 4, num3 = 6, num4 = 9;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;
        System.out.println(num1 + " < " + num2 + " && " +
                num3 + " != " + num4 + " = " + resposta);

        resposta = num1 < num2 || num3 != num4;
        System.out.println(num1 + " < " + num2 + " || " +
                num3 + " != " + num4 + " = " + resposta);

    }
}