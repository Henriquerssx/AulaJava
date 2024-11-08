package aula06.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[2][3];
        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[0][2] = 3;
        matrizNumeros[1][1] = 4;
        matrizNumeros[1][2] = 5;

        System.out.println("O numero da posição (1.2)é " + matrizNumeros[1][2]);

    }
}
