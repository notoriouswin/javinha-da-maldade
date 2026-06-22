package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void impressora(Estudantes estudantes){
        System.out.println("--------");
        System.out.println(estudantes.nome);
        System.out.println(estudantes.idade);
        System.out.println(estudantes.sexo);
    }
}
