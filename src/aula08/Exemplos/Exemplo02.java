package aula08.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {
        File Arquivo = new File("src\\aula08\\Exemplos\\Arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(Arquivo);
            fileWriter.write("texto");
            fileWriter.close();

            FileReader fileReader = new FileReader(Arquivo);
            int caractere;
            while((caractere = fileReader.read()) != -1)
            {
                System.out.print((char) caractere);
            }
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
