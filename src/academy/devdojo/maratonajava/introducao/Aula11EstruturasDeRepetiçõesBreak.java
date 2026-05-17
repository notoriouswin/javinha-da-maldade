package academy.devdojo.maratonajava.introducao;

public class Aula11EstruturasDeRepetiçõesBreak {
    public static void main(String[]args){
        // Imprima os primeiros 25 números de um dado valor. Por exemplo, 50.

        int valorMax = 50;
        int i = 0;
        for (; i <= valorMax; i++){
            System.out.println(i);
            if (i == 25) {
                break;
            }
        }
    }
}
