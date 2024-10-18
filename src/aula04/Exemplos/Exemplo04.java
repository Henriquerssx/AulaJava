package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String corSemaforo;

            System.out.println("Fale a cor do semaforo");
            corSemaforo = scanner.nextLine();
            switch (corSemaforo) {

                case "verde", "Verde": {
                    System.out.println("SIGA");
                    break;
                }
                case "amarelo", "Amarelo": {
                    System.out.println("ATENÇÃO");
                    break;
                }
                case "vermelho", "Vermelho":
                    ;
                {
                    System.out.println("PARE");
                    break;

                }
            }
    }
}