package aula08.Exercicios;

import java.io.*;

public class Exercicio03 {
    public static void main(String[] args) {
        File arquivoDosAlunos = new File("src\\aula08\\Exercicios\\alunos.txt");
        File backup = new File("src\\aula08\\Exercicios\\backup_alunos.txt");
        try {
            if (arquivoDosAlunos.exists()) {
                System.out.println("Já existe esse arquivo");
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoDosAlunos));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(backup));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Conteúdo copiado com sucesso");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}