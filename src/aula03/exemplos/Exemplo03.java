package aula03.exemplos;

public class Exemplo03 {
    public static void main(Exemplo08[] args) {
        //comparadores
        int num1=3, num2=7;
        boolean resposta;
        resposta = num1>num2;
        System.out.println(num1+ " > " +num2 + " = "+resposta);

        resposta = num1<num2;
        System.out.println(num1+ " < " +num2 + " = "+resposta);

        resposta = num1>=num2;
        System.out.println(num1+ " >= " +num2 + " = "+resposta);

        resposta = num1<=num2;
        System.out.println(num1+ " <= " +num2 + " = "+resposta);

        resposta = num1==num2;
        System.out.println(num1+ " == " +num2 + " = "+resposta);

        resposta = num1!=num2;
        System.out.println(num1+ " != " +num2 + " = "+resposta);
    }
}

