package aula05.Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
    int numero1=1, numero2=0, qntd=0;
        System.out.println("10 primeiros fibonacci");
    while(qntd<10){
        int somatoria = numero1 + numero2;
        numero2 = numero1;
        numero1 = somatoria;
        qntd++;
        System.out.println(numero2);}
    }
}
