package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudantes;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[]args){
        Estudantes estudante01 = new Estudantes();
        Estudantes estudante02 = new Estudantes();
        ImpressoraEstudante imprimir = new ImpressoraEstudante();

        estudante01.nome = "Matheus";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Bruna";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        // usando um metodo criado apartir de uma nova classe separada
        imprimir.impressora(estudante01);
        imprimir.impressora(estudante02);

        // usando um metodo direto no objeto
        estudante01.imprime();
        estudante02.imprime();

    }
}
