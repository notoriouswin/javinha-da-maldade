package academy.devdojo.maratonajava.introducao;

/*
    Abaixo vou listar os tipos de operadores aritméticos e suas funções na linguagem Java

    Soma = +
    Subtração = -
    Divisão = /
    Multiplicação = *
    Resto Da Divisão = %
 */

public class Aula04Operadores {
    public static void main(String[]args){
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);

        /*
            acima você consegue ver uma operação sendo feita de maneira simples, porém a um ponto que temos que deixar claro
            se você colocar uma String antes da operação de soma, o valor da soma dos dois números serão concatenados.
         */

        System.out.println("A soma do numero1 e do numero2 é: "+numero1+numero2);

        /*
            Este é um detalhe importante a ser lembrado, mas a diversas maneiras de contornar esse problema
            se você colocar a operação de soma antes da String, o resultando da soma ira aparecer normalmente.
         */

        System.out.println(numero1+numero2+": Esta é a soma do numero1 e do numero2");

        /*
            ou você pode também colocar o resultado da soma em um tipo primitivo, da seguinte forma
         */

        int resultadoSoma = numero1+numero2;
        System.out.println("A soma do numero1 e do numero2 é: "+resultadoSoma);

        //Obs: esse problema de concatenação só da em operações de soma





        /*
            Outro ponto importante de ser lembrado e nas operações onde são feitas com números inteiros
            sempre que você fizer uma operação com números inteiros o resultado sempre será um número inteiro
         */

        int numero3 = 5;
        int numero4 = 10;
        System.out.println(numero3/numero4);

        /*
            porem se você trocar para um tipo double o resultado será calculado de maneira diferente
         */

        System.out.println(numero3/(double)numero4);







        /*
            Abaixo vou listar alguns operadores lógicos da linguagem Java (esses operadores sempre retornam valores booleans)

            '>' = maior que
            '<' = menor que
            '>=' = maior igual que
            '<=' = menor igual que
            '==' = igual que
            '!=' = diferente que
            '&&' = AND (Ele compara duas (ou mais) condições, e só retorna true se todas forem verdadeiras)
            '||' = OR (Ele retorna true se pelo menos UMA condição for verdadeira, e só dá false se todas forem falsas)
            '!' = NOT (transforma o valor no oposto, se uma condição não for aquilo que ele pede ele retorna o valor de true)
         */

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("Dez é maior que vinte: "+isDezMaiorVinte);
        System.out.println("Dez é menor que vinte: "+isDezMenorVinte);
        System.out.println("Dez é igual a vinte: "+isDezIgualVinte);
        System.out.println("Dez é diferente de vinte: "+isDezDiferenteVinte);

        /*
            porem devemos nos atentar que esses operadores lógicos não levam sempre ao pé-da-letra o resultado
            e se você tentar fazer algumas operações lógicas, como compara uma String com valor de 10 e um número int com valor de 10
            vai ocasionar em um erro, e se você tentar fazer uma operação onde compara um número double 10,0 com um número int 10
            o resultado vai ser verdadeiro por ambos os números terem o mesmo resultado mesmo sendo escrito de maneira diferentes
         */

        System.out.println(10 == 10.0);

        //    ou

        String numeroDezString = "10";
        // System.out.println(numeroDezString == 10); se tirar o comentário avera um erro





        /*
            Agora vamos praticar a lógica END

            Crie um programa que verifique se a pessoa pode entrar em um evento.

            Regras:

            Precisa ter 18 anos OU mais
            E precisa ter pelo menos R$ 50

            👉 Use && pra validar as duas condições.
         */
        int idade = 22;
        int dinheiro = 80;
        boolean podeEntrarNoEvento = idade >= 18 && dinheiro>= 50;
        boolean naoPodeEntrarNoEvento = idade < 18 && dinheiro < 50;
        System.out.println("Matheus pode entrar no evento: "+podeEntrarNoEvento);
        System.out.println("Matheus pode entrar no evento: "+naoPodeEntrarNoEvento);





        /*
            Agora vamos praticar a lógica OR

            Crie um programa que verifique se a pessoa pode comprar um PS5.

            Regras:

            Precisa ter dois cartoes, um crédito e outro débito
            a lógica ira verificar os dois cartoes se tem saldo suficiente para o PS5

            👉 Use || para validar as duas condições.
         */
        double cartaoCredito = 4000.50;
        double cartaoDebito = 600.68;
        double valorPlaystation5 = 2800.20;
        boolean consegueComprarPlaystations5 = cartaoDebito >= valorPlaystation5 || cartaoCredito >= valorPlaystation5;
        System.out.println("A pessoa tem dinheiro para comprar o Playstatio5: "+consegueComprarPlaystations5);





        /*
        Abaixo vou listar alguns operadores de atribuição da linguagem Java

        '=' = recebe
        '+=' = igual ele mesmo somado por
        '-=' = igual ele mesmo subtraído por
        '*=' = igual ele mesmo multiplicado por
        '/=' = igual ele mesmo dividido por
        '%=' = igual ele resto da divisão por
        '++' = acrescenta 1 no valor
        '--' = subtrai 1 o valor
         */

        int idadeBruna = 25;
        idadeBruna = idadeBruna + 1; //aqui temos o código completo da soma

        int idadeBrunaSimplificado = 25;
        idadeBrunaSimplificado += 1; //aqui temos o código simplificado

        System.out.println("idade da bruna completo: "+idadeBruna);
        System.out.println("idade da bruna simplificado: "+idadeBrunaSimplificado);
        // isso serve para qualquer um dos operadores acima






        /*
            Agora um ponto importante com o nosso amigo "++" e "--", tem algo interessante que precisa ser citado
            o operador ++ muda a lógica dependendo do local onde você coloca ele
            você pode colocar ele antes ou depois do valor ficando das seguintes maneiras
            "idadeBrunaAcrescentar++" ou + "+idadeBrunaAcrescentar" dependendo do local ele ira executar primeiro uma função para depois acrescentar 1 no valor
         */

        int idadeBrunaAcrescentarPrimeiro = 25;
        System.out.println("mostre a idade da bruna: "+ ++idadeBrunaAcrescentarPrimeiro);  //aqui ele ira primeiro acrescentar 1 para depois imprimir o valor

        int idadeBrunaAcrescentarDepois = 25;
        System.out.println("mostre a idade da bruna: "+ idadeBrunaAcrescentarDepois++);   // aqui ele ira primeiro imprimir o valor para depois acrescentar 1
    }
}
