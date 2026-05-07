package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturaCondicionaisSwitch {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");

            default:
                System.out.println("Não foi encontrado nenhum resultado");
        }

        char sex = 'M';
        switch (sex){
            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Femenina");
                break;

            default:
                System.out.println("Sexo não definido");
                break;
        }
    }
}
