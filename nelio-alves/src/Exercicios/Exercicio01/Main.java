package Exercicios.Exercicio01;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static final double NUMERO_DE_PI = 3.14159;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o raio do seu circulo:");
        double R = scan.nextDouble();
        double A = NUMERO_DE_PI * (Math.pow(R,2));

        System.out.printf("A=%.4f %n",A);
    }
}