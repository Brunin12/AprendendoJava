import java.util.Scanner;

public class aula22 {
    public static void main(String[] args) {
        System.out.println("Digite um numero:");
        Scanner input = new Scanner(System.in);
        var li = input.nextInt();
        var n1 = 1;
        var n2 = 0;

        while (n1 < li) {
            int fn = n1 + n2;
            if (fn > li)
                break;
            System.out.println(fn);
            n2 = n1;
            n1 = fn;
        }

    }
}
