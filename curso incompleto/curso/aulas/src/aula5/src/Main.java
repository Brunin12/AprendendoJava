public class Main {
    public static void main(String[] args) {

        // Mostrar no console

        System.out.print("Olá\n");
        System.out.print("Olá\n");
        System.out.print("Olá\n");

        System.out.println("Olá Mundo!");
        System.out.println("Olá Mundo!");
        System.out.println("Olá Mundo!");

        var nome = "Fulano";
        var idade = 35;
        var peso = 47.39;

        System.out.println(nome + idade);
        System.out.println(nome + peso);
        System.out.println(idade + peso);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);



        System.out.printf("Nome: %s\nIdade: %d\nPeso: %.1f", nome, idade, peso);


    }
}