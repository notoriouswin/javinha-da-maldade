package academy.devdojo.maratonajava.introducao;

public class Aula16ArraysFormasDeInicializar {
    public static void main(String[]args){
        // maneira padrão, normalmente mais utilizada por deixar o código mais limpo e para arrays com grande número de valores
        String [] nomes = new String[3];
        nomes [0] = "Matheus";
        nomes [1] = "Lucas";
        nomes [2] = "Bruna";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        // maneira mais fácil, mais usada em arrays com pouco número de valores
        int[] idades = {18,22,25};
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

        // maneira menos usada por ter uma escrita mais confusa, e cumprir o mesmo papel das opções anteriores
        char [] sexo = new char[]{'M','F','B','L'};{
            for (int i = 0; i < sexo.length; i++){
                System.out.println(sexo[i]);
            }
        }
    }
}
