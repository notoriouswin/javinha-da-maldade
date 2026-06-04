package academy.devdojo.maratonajava.introducao;

public class Aula20ArraysMultidimensionaisInicializacao {
    public static void main(String[]args){
        int[][] sistemaDeNotas = new int[3][];
        sistemaDeNotas[0] = new int[2];
        sistemaDeNotas[1] = new int[5];
        sistemaDeNotas[2] = new int[8];

        for (int[] i : sistemaDeNotas){
            for (int j : i){
                System.out.println(j);
            }
        }
    }
}
