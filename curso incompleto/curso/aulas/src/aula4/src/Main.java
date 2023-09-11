public class Main {
    public static void main(String[] args) {

//        Como usar Strings

        String nome = "Bruno";

        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println("ola "+nome + "!");
        System.out.printf("ola %s!\n",nome);
        var info = String.format("ola senhor %s", nome);

        System.out.println(info);
        System.out.println(info.contains("pedro"));
        System.out.println(info.contains("Bruno"));

        var frase = "ele é muito pro, ele é uma lenda... ele é o ";

        System.out.println(frase.concat("Sharopinho no modo sharing!"));

        frase = "o Bruce Wayne é o batman";

        frase = frase.toUpperCase().concat("!?");

        System.out.println(frase);




    }
}