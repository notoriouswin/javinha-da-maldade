package academy.devdojo.maratonajava.introducao;

public class Aula06ExercicioEstruturasCondicionais {
    public static void main(String[] args){
        double salarioTrabalhadorAnual = 25000.50;
        String porcentagemImpostoDeRenda;
        if (salarioTrabalhadorAnual <= 34712){
            porcentagemImpostoDeRenda = "Você deve pagar 9% de imposto de renda";
        } else if(salarioTrabalhadorAnual > 34712 && salarioTrabalhadorAnual <= 68507){
            porcentagemImpostoDeRenda = "Você deve pagar 37% de imposto de renda";
        } else {
            porcentagemImpostoDeRenda = "Você deve pagar 49% de imposto de renda";
        }
        System.out.println(porcentagemImpostoDeRenda);

        // ou você pode efetuar a mesma estrutura da seguinte forma

        salarioTrabalhadorAnual = 69000.50;
        porcentagemImpostoDeRenda = salarioTrabalhadorAnual <= 34712 ? "Você deve pagar 9% de imposto de renda" : salarioTrabalhadorAnual > 34712 && salarioTrabalhadorAnual <= 68507 ? "Você deve pagar 37% de imposto de renda" : "Você deve pagar 49% de imposto de renda";
        System.out.println(porcentagemImpostoDeRenda);
    }
}
