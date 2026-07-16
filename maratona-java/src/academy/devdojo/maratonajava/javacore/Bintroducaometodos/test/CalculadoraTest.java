package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Fim do metodo somaDoisNumeros \n");

        calculadora.subtraiDoisNumeros();
        System.out.println("Fim do metodo subtraiDoisNumeros \n");

        calculadora.multiplicaDoisNumeros(10, 5);
        System.out.println("Fim do metodo multiplicaDoisNumeros \n");

        double result = calculadora.divideDoisNumeros(50, 4);
        System.out.println(result);

        // alteraDoisNumeros EM AÇÃO
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("-------");
        System.out.println("Dentro do Calculadora Test");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        /*
            a = 1 e b = 2 são copiados para numero1 e numero2.
            Dentro do método, você muda os valores de numero1 e numero2 para 99 e 33, mas essas mudanças afetam apenas as cópias.
            Fora do método, a e b continuam com os valores originais, 1 e 2, porque não foram alterados diretamente, só suas cópias.

            É como se você tivesse duas folhas de papel:

            Você escreve 1 e 2 nas suas folhas (a e b).
            Depois, você tira cópias dessas folhas e as dá para o método (numero1 e numero2).
            O método rabisca as cópias e escreve 99 e 33.
            Mas as folhas originais (a e b) ainda estão intocadas com 1 e 2.
         */

        int []numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(5,5,5,5,10,20);

    }
}
