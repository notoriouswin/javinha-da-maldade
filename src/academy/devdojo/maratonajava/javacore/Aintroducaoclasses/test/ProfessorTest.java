package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ana Lucia";
        professor.idade = 43;
        professor.sexo = 'F';

        System.out.println("Nome: "+professor.nome+"\n"+"Idade: "+professor.idade+"\n"+"Sexo: "+professor.sexo);
    }
}
