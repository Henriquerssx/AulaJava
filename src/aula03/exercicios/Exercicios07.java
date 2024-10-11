package aula03.exercicios;

public class Exercicios07 {
    public static void main(String[] args) {
        int num1 = 4, num2 = 3, num3 = 3, num4 = 4;
        boolean cond1, cond2,cond3;
        cond1= num1 < num2  && num3 != num4;
        cond2= num1 > num2 || num3 < num4;
         cond3= num1== num2  && num3 != num4;

        System.out.println(" condição1:" + cond1 + "\n condição2:"
                + cond2+ "\n condição3:" + cond3);
    }
}