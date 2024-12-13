package aula08.Exercicios;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivoDosAlunos = new File("src\\aula08\\Exercicios\\alunos.txt");

        try {
            if (arquivoDosAlunos.exists()) {
                System.out.println("Ja tem");}
            else {
            if (arquivoDosAlunos.createNewFile()) {
                System.out.println("Arquivo criado com sucesso " + arquivoDosAlunos.getName());
            } else {
                System.out.println("Falhou ao criar o arquivo");
            }
            FileWriter fileWriter = new FileWriter(arquivoDosAlunos);
            System.out.println("Digite 5 nomes ");
            for (int rep = 0; rep < 5; rep++) {
                fileWriter.write(scanner.nextLine() );
            }
            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
