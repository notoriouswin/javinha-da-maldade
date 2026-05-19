package academy.devdojo.maratonajava.introducao;

public class Aula16ArraysImprimindoCompleto {
    public static void main(String[]args){
        String [] nomes = new String[3];
        nomes [0] = "Matheus";
        nomes [1] = "Lucas";
        nomes [2] = "Bruna";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
