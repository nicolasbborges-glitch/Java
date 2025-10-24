package firstProject;

public class Gato1 {

    String nome;
    String raca;
    int idade;

    public void miar() {
        System.out.println("Miau!");
    }

    public void comer() {
        System.out.println(nome + " está comendo");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Gato1 gato = new Gato1();
        gato.nome = "Garfield";
        gato.raca = "Persa";
        gato.idade = 5;

        gato.miar();
        gato.comer();
        gato.mostrarInformacoes();
    }
}