package aula06.Exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0, 1, 2}, //primeira linha
                {3, 4, 5}, //segunda linha
                {6, 7, 8}  //terceira linha
        };

        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                System.out.println(matrizNumeros[linha][coluna]);
            }
        }

        String[][] nomes = {{"Jose", "Rafael"}, {"Henrique", "Jessica"}};
        for (int linhaNome = 0; linhaNome < nomes.length; linhaNome++) {
            for (int colunaNome = 0; colunaNome < nomes[linhaNome].length; colunaNome++) {
                System.out.println(nomes[linhaNome][colunaNome]);

            }
        }
    }
}
