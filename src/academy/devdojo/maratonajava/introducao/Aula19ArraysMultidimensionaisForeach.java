package academy.devdojo.maratonajava.introducao;

public class Aula19ArraysMultidimensionaisForeach {
    public static void main(String[]args){
        int[][] calendario = new int[4][4];

        // Verão
        calendario [0][0] = 31;
        calendario [0][1] = 28;
        calendario [0][2] = 31;
        calendario [0][3] = 30;

        // Outono
        calendario [1][0] = 31;
        calendario [1][1] = 30;
        calendario [1][2] = 31;
        calendario [1][3] = 31;

        // Inverno
        calendario [2][0] = 30;
        calendario [2][1] = 31;
        calendario [2][2] = 30;
        calendario [2][3] = 31;

        // Primavera
        calendario [3][0] = 30;
        calendario [3][1] = 31;
        calendario [3][2] = 30;
        calendario [3][3] = 31;

        for (int[] i : calendario){
            for (int j : i){
                System.out.println(j);
            }
        }
    }
}
