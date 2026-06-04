package academy.devdojo.maratonajava.introducao;

public class Aula20ArraysMultidimensionaisInicializacao {
    public static void main(String[]args){
        int[][] sistemaDeNotas = new int[3][];
        sistemaDeNotas[0] = new int [2];
        sistemaDeNotas[1] = new int[4];
        sistemaDeNotas[2] = new int[6];

        for (int[] i : sistemaDeNotas){
            System.out.println("-----------");
            for (int j : i){
                System.out.println(j);
            }
        }
    }
}
