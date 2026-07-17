package Exercicios.Exercicio02;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int A,B,C,D;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        int diferenca = (A*B-C*D);
        System.out.printf("DIFERENCA = %d%n",diferenca);
    }
}
