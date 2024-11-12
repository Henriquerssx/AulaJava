package aula06.Exemplos;

public class Exemplo08 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {{0, 1, 2}, //primeira linha
                {3, 4, 5}, //segunda linha
                {6, 7, 8}  //terceira linha
        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int numero : matrizNumero) {
                System.out.println(numero);
            }
        }

        String[][] matrizNomes = {{"Henrique", "Jose"}, {"Rafael", "Juan"}};
        for (String[] matrizNome : matrizNomes) {
            for (String nome : matrizNome) {
                System.out.println(nome);

            }
        }
    }
}
