import java.util.Scanner;

public class aula7 {
    public static void main(String[] args) {
        System.out.println("qual seu nome");
        Scanner scan = new Scanner(System.in);
        var nome = scan.nextLine();
        System.out.println("ola " + nome);
        System.out.println(nome.getClass());
    }
}
