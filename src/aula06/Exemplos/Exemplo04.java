package aula06.Exemplos;

public class Exemplo04 {
    public static void main(String[] args) {

        int[][] matrizNumeros = {
                {0, 1, 2}, //primeira linha
                {3, 4, 5}, //segunda linha
                {6, 7, 8}  //terceira linha
        };
        System.out.println("valor da posição (2,1) é: " + matrizNumeros[2][1]);

        String[][] nomes = { {"Jose", "Henrique"}, {"Rafael", "Lucas"}};

        System.out.println("O nome da posição (1,1) é: " + nomes[1][1]);




    }
}
