package Exercicios.Exercicio05;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if ((num1 % num2 == 0) || (num2 % num1 == 0) ){
            System.out.println("São multiplos");
        } else{
            System.out.println("Não são multiplos");
        }
    }
}
