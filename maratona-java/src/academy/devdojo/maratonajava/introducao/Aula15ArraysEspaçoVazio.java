package academy.devdojo.maratonajava.introducao;

public class Aula15ArraysEspaçoVazio {
    public static void main(String[] args) {
        // byte, short, int, long, float, double:
        // todos esses tipos irão receber o valor de zero "0" se o valor estiver vázio
        int [] valorZero = new int[2];
        System.out.println(valorZero[1]);

        // char = \u0000 = " "
        char [] valorVazio = new char[2];
        System.out.println(valorVazio[1]);

        // boolean = false
        boolean [] valorFalso = new boolean[2];
        System.out.println(valorFalso[1]);

        // String = null
        String [] valorNulo = new String[2];
        System.out.println(valorNulo[1]);
    }
}
