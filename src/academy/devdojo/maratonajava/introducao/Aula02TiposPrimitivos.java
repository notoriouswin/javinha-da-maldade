package academy.devdojo.maratonajava.introducao;

/*
 * Tipos Primitivos, são tipos simples que irão guardar valores na memória. Abaixo está a lista de tipos:

 - byte = números inteiros bem pequenos (-128 até 127)
 - short = números inteiros pequenos (-32.768 até 32.767)
 - int = números inteiros (O padrão que mais vai usar)
 - long = números inteiros grandes (quando int não der conta usa long)
 - float = número decimal (menos preciso e usa menos memoria também)
 - double = número decimal (mais preciso, o padrão para números decímais)
 - char = um único caractere (tipo: 'a' '1' '.') obs: para char você deve usar aspas simples
 - boolean = verdadeiro ou falso (dois valores, true ou false)
 */

public class Aula02TiposPrimitivos {

    public static void main(String[]args){

        /*
         *Você também pode forçar um valor de um tipo primitivo a entrar em outro tipo
         *fazendo um cast, exemplo você tem um, numero decimal, mas você quer força ele a se tornar, você consegue fazer isso com um cast
         * abaixo vou mostrar um exemplo:
         */
        int exemploNumeroDecimalVirandoInteiro = (int) 65.6D;
        System.out.println(exemploNumeroDecimalVirandoInteiro);




        // sempre que a referência tiver mais de uma palavra, a primeira sempre vai ser minuscula e as seguintes vai começar com uma letra maiúscula
        int idadeDoPai = 62;
        int idadeDoFilho = 22;
        System.out.println("A idade do pai é: "+idadeDoPai+ " e a idade do filho é: "+idadeDoFilho);
    }
}
