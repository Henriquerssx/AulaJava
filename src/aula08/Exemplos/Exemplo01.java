package aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\Exemplos\\Arquivo.txt");
        if (arquivo.exists()) {
            System.out.println("Ja tem");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso " + arquivo.getName());
                } else {
                    System.out.println("Falhou");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
