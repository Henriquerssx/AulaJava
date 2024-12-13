package aula08.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivoDosAlunos = new File("src\\aula08\\Exercicios\\alunos.txt");
        try {
            if (arquivoDosAlunos.exists()) {
                System.out.println("Já existe esse arquivo");
            } else {
                if (arquivoDosAlunos.createNewFile()) {
                    System.out.println("Arquivo criado " + arquivoDosAlunos.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo.");
                }
            }

            FileWriter fileWriter = new FileWriter(arquivoDosAlunos);
            System.out.println("Digite 5 nomes :");
            String linha = "\n";
            for (int i = 0; i < 5; i++) {
                String nomes = scanner.nextLine();
                fileWriter.write(nomes +linha );
            }
            fileWriter.close();
            System.out.println("Nomes salvos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        scanner.close();
    }
}

