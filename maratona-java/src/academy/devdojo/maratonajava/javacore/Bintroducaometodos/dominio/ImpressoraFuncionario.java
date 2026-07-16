package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraFuncionario {

    public static void imprimir(Funcionario funcionario){
        System.out.println("Nome Funcionario: "+ funcionario.nome);
        System.out.println("idade Funcionario: "+ funcionario.idade);
        System.out.println("----------------\nSalarios:");
        System.out.println(funcionario.salario[0]);
        System.out.println(funcionario.salario[1]);
        System.out.println(funcionario.salario[2]);
    }
}

