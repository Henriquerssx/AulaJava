package aula04.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String semaforo;

        System.out.println("Digite a cor do semáforo");
        semaforo = scanner.nextLine();


        if (semaforo.equals("verde") || semaforo.equals("Verde")) {
            System.out.println("SIGA");
        } else if (semaforo.equals("amarelo") || semaforo.equals("Amarelo")) {
            System.out.println("ATENÇÃO");
        } else if (semaforo.equals("vermelho") || semaforo.equals("Vermelho")) {
            System.out.println("PARE");
        } else {
            System.out.println("Cor inválida");
        }
    scanner.close();

} }
