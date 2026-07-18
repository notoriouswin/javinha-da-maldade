package Exercicios.Exercicio04;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        if ((numero % 2) == 0 ){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
