package aula05.Exercicios;

public class Exercicio02 {
    public static void main(String[] args) {

        int numero = 1;
        int pares = 0;

        while (numero <= 100) {
        if (numero % 2 == 0) {
            pares += numero ;}
        numero++;
        }
System.out.println(pares);}
}
