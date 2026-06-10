package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[]args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Fim do metodo somaDoisNumeros \n");
        calculadora.subtraiDoisNumeros();
        System.out.println("Fim do metodo subtraiDoisNumeros \n");

    }
}
