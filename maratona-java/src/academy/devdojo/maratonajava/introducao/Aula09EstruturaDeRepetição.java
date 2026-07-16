package academy.devdojo.maratonajava.introducao;

public class Aula09EstruturaDeRepetição {
    public static void main(String[]args){
        //while = enquanto (condição = true) while se repete em loop
        int contador = 0;
        while (contador < 10){
            System.out.println(contador);
            contador += 1;
        }

        // do while = faça enquanto (condição = true) do while ira executar pelo menos uma vez, mesmo o valor sendo false
        contador = 0;
        do{
            System.out.println("Olá, do estando mandando eu fazer algo");
            contador += 1;
        }while(contador < 10);

        // for = (para um valor de uma variável declara no corpo) + (for...) + (faça)
        for (int i=0; i < 10; i++){
            System.out.println("for "+ i);
        }
    }
}
