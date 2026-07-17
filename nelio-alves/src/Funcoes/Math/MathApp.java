package Funcoes.Math;
import java.util.Locale;
import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        MathFuncoes matematica = new MathFuncoes();

        System.out.println("Escolha um numero");
        int x = scan.nextInt();
        System.out.println("Escolha outro numero:");
        int y = scan.nextInt();
        System.out.println("Escolha um numero negativo");
        int z = scan.nextInt();
        System.out.println("Escolha um numero decimal");
        double w = scan.nextDouble();
        System.out.println("Escolha outro numero decimal , vamos arredondar ele para cima");
        double v = scan.nextDouble();
        System.out.println("Escolha outro numero decimal , vamos arredondar ele para baixo");
        double t = scan.nextDouble();

        matematica.raizQuadrada(x);
        matematica.elevadoAoQuadrado(x,y);
        matematica.valorAbsoluto(z);
        matematica.arredondarNumero(w);
        matematica.arredondarNumeroParaCima(v);
        matematica.arredondarNumeroParaBaixo(t);
    }
}