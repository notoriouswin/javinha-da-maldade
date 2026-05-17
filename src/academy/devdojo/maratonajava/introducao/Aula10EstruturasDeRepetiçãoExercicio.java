package academy.devdojo.maratonajava.introducao;

public class Aula10EstruturasDeRepetiçãoExercicio {
    public static void main(String[]args){
        // Imprima todos os número pares do 0 até 1000000
        for (int numero = 0; numero <= 1000000; numero++){
            if (numero % 2 ==0) {
                System.out.println(numero);
            }
        }
    }
}
