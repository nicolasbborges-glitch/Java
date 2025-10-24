package firstProject;

public class Gato2 {

    public static void main(String[] args) {

        Gato1 gato1 = new Gato1();
        gato1.nome = "Garfield";
        gato1.raca = "Persa";
        gato1.idade = 5;

        Gato1 gato2 = new Gato1();
        gato2.nome = "Exemplo";
        gato2.raca = "Sla";
        gato2.idade = 5;

        gato1.miar();
        gato1.comer();
        gato1.mostrarInformacoes();

        System.out.println("--------------------");

        gato2.miar();
        gato2.comer();
        gato2.mostrarInformacoes();
    }
}