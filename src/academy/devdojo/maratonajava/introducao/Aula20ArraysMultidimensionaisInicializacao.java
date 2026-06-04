package academy.devdojo.maratonajava.introducao;

public class Aula20ArraysMultidimensionaisInicializacao {
    public static void main(String[]args){

        // PRIMEIRA FORMA DE INICIALIZAR
        int[][] sistemaArray = new int[3][];
        sistemaArray[0] = new int [2];
        sistemaArray[1] = new int[4];
        sistemaArray[2] = new int[6];
        for (int[] i : sistemaArray){
            System.out.println("-----------");
            for (int j : i){
                System.out.println(j);
            }
        }
        System.out.println("Primeiro método");


        // SEGUNDA FORMA DE INICIALIZAR
        int[][] sistemaArraySegundo = {{1,2}, {1,2,3,4}, {1,2,3,4,5,6}};
        for (int[] i : sistemaArraySegundo){
            System.out.println("-----------");
            for (int j : i){
                System.out.println(j);
            }
        }
        System.out.println("Segundo método");


        // TERCEIRO FORMA DE INICIALIZAR
        int[][] sistemaArrayTerceiro = new int[3][];
        sistemaArrayTerceiro[0] = new int[] {1,2};
        sistemaArrayTerceiro[1] = new int[] {1,2,3,4};
        sistemaArrayTerceiro[2] = new int[] {1,2,3,4,5,6};
        for (int[] i : sistemaArrayTerceiro){
            System.out.println("-----------");
            for (int j : i){
                System.out.println(j);
            }
        }
        System.out.println("Terceiro método");
    }
}
