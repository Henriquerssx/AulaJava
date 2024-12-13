package aula08.Exercicios;

import java.io.BufferedReader;
import java.io.*;

public class Exercicio02 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\aula08\\Exercicios\\alunos.txt"));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
