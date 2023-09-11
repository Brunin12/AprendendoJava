public class Usuario {
    private static String nome;
    private static int idade;


    public  Usuario(String nome, int idade) {
        setIdd(idade);
        setNome(nome);
    }
    public static void show() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdd());
        System.out.println("");
    }


    protected static String getNome() {
        return Usuario.nome;
    }

    protected static int getIdd() {
        return Usuario.idade;
    }


    protected static void setNome(String nome) {
        Usuario.nome = nome;
    }

    protected static void setIdd(int idade) {
        Usuario.idade = idade;
    }



}
