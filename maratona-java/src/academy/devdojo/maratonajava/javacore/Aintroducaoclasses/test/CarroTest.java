package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Honda Civic";
        carro1.modelo = "Civic G10";
        carro1.ano = 2021;

        Carro carro2 = new Carro();
        carro2.nome = "Golf Sapão";
        carro2.modelo = "MK4";
        carro2.ano = 2013;

        System.out.println("Nome: "+carro1.nome+"\n"+"Modelo: "+carro1.modelo+"\n"+"Ano: "+carro1.ano);
        System.out.println("--------------------");
        System.out.println("Nome: "+carro2.nome+"\n"+"Modelo: "+carro2.modelo+"\n"+"Ano: "+carro2.ano);

    }

}
