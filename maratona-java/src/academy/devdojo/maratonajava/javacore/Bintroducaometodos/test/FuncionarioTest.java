package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioMediaSalario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraFuncionario;

public class FuncionarioTest {
    public static void main(String[]args){
        FuncionarioMediaSalario mediaSalario = new FuncionarioMediaSalario();
        Funcionario funcionarioFirst = new Funcionario();
        funcionarioFirst.nome = "Matheus";
        funcionarioFirst.idade = 23;
        funcionarioFirst.salario = new double[]{2356.50,2149.59,1250.00};

        Funcionario funcionarioSecond = new Funcionario();
        funcionarioSecond.nome = "Iris";
        funcionarioSecond.idade = 25;
        funcionarioSecond.salario = new double[]{5450.00,8750.50,1000.00};

        ImpressoraFuncionario.imprimir(funcionarioFirst);
        mediaSalario.tirarMediaSalarial();

    }
}
