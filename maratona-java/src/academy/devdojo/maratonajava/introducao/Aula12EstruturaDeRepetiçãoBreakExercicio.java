package academy.devdojo.maratonajava.introducao;

public class Aula12EstruturaDeRepetiçãoBreakExercicio {
    public static void main(String[]args) {
        //Dado o valor de uma moto, descubra em quantas vezes ela pode ser parcelada.
        // Condição o valor máximo de uma parcela deve ser >= 880.

        int parcela = 1;
        int valorDaMoto = 31680;
        int valorDaParcela = valorDaMoto / parcela;

        for (parcela = 1; parcela <= valorDaMoto; parcela++){
            valorDaParcela = valorDaMoto / parcela;
                if (valorDaParcela >= 880){
                    System.out.println("foram " + parcela + " parcelas de " + valorDaParcela);
                } else {
                    break;
                }
        }

    }
}
