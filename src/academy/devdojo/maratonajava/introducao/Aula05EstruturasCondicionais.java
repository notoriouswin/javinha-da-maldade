package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idadeMatheus = 17;
        boolean matheusPodeComprarBebida = idadeMatheus >= 18;
        if(matheusPodeComprarBebida){
            System.out.println("Matheus está autorizado a comprar bebida, porque ele tem "+idadeMatheus+ " anos");
        }
        if(!matheusPodeComprarBebida){
            System.out.println("Matheus não esta autorizado a comprar bebida, porque ele tem "+idadeMatheus+ " anos");
        }
        // o modelo acima não está errado, porem existe um jeito mais simples para fazer essa estrutura, útilizando condição else (se não)

        int valorAluguel = 880;
        int saldoConta = 800;
        if(saldoConta > valorAluguel){
            System.out.println("Você consegue pagar o aluguel por que o saldo da sua conta é: "+saldoConta);
        } else{
            System.out.println("Você nao tem dinheiro suficiente para pagar o aluguel, o saldo da sua conta é: "+saldoConta+" e o valor do aluguel é: "+valorAluguel);
        }
        // mas essa não é a única variação para uma estrutura condicional, você pode adicionar mais condições usando o else if(se não se)

        int idadeJogador = 17;
        if (idadeJogador <= 15){
           System.out.println("Jogador Infântil");
        } else if (idadeJogador > 15 && idadeJogador < 18){
            System.out.println("Jogador Juvenil");
        } else{
            System.out.println("Jogador Profissional");
        }

        /*
        Existe uma forma de simplificar essa estrutura de if e else, mas ela só pode ser usada caso o valor for do mesmo tipo
        exemplo: se não for string vai ser string, parece meio complicado, mas vou fazer um código abaixo e ficará mais fácil de compreender
         */
        String nomePessoa = "Matheus";
        String duvidaSobreAPessoa = nomePessoa == "Matheus" ? "Pessoa é bonita" : "Pessoa é feia";
        System.out.println(duvidaSobreAPessoa);

        /*
         ou para adicionar mais de uma condição você terá que seguir a seguinte lógica
         (condição) (? = verdade) (: = se não)
         (condição) (? = verdade) : = (condição) (? = verdade) (: = se não)
         */
        String sexoDaPessoa = "qualquer coisa";
        String resultado = sexoDaPessoa == "M" ? "Masculino" : sexoDaPessoa == "F" ? "Femenina" : "ET";
        System.out.println(resultado);



    }
}
