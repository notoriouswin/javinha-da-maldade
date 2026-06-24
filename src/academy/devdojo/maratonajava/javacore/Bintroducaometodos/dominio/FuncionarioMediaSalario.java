package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioMediaSalario {
    Funcionario funcionario = new Funcionario();

    public void tirarMediaSalarial(){
        double[] funcionarioSalarios = funcionario.salario;
        double somaSalarios = 0;
        for (int i = 0; i < funcionarioSalarios.length; i++){
            somaSalarios += funcionarioSalarios[i];
        }
        System.out.println("A sua média Salarial é:");
        System.out.println(somaSalarios);
    }
}
