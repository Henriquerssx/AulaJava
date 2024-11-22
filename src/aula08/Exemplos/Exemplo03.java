package aula08.Exemplos;

import java.io.*;

public class Exemplo03 {
    public static void main(String[] args) {
        File Arquivo = new File("src\\aula08\\Exemplos\\Arquivo.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Arquivo));
            bufferedWriter.write("novo texto a ser gravado");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(Arquivo));
            String linha = bufferedReader.readLine();
            System.out.println(linha);
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
