package academy.devdojo.maratonajava.introducao;

public class Aula17ArraysForeach {
    public static void main(String[]argas){
        // Foreach é uma forma de simplificar o for, ele usa um sistema em que ele executa os valores do array em sequência sem ter que criar condições/indices com o for
        String[] sobrenomes = {"Bessa","Silva","Joaquim","Queiroz"};
        for (String i : sobrenomes){
            System.out.println(i);
        }
        // só temos que lembrar que o tipo da variável dentro do for tem que ser igual ao do array
    }
}
