package academy.devdojo.maratonajava.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

Obs: String não é um tipo primitivo, ela é um objeto, mas para esse exercícios iremos usar essa classe para treinar o que foi aprendido
*/

public class Aula03ExercicioTiposPrimitivos {
    public static void main(String[]args){
        String nome = "Matheus Bessa";
        String endereco = "Rua Engenheiro Silva Braga 562";
        double salario = 4476.04;
        String data = "05/05/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".";
        System.out.println(relatorio);
    }
}
