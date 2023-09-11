import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        if (args.length > 0) {
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);
            calc(n1, n2);
        } else {
            System.out.println("Digite um numero");
            Scanner scanner = new Scanner(System.in);
            double n1 = scanner.nextDouble();
            cls();
            System.out.println("Digite outro numero");
            Scanner scanner2 = new Scanner(System.in);
            double n2 = scanner2.nextDouble();
            br();
            calc(n1, n2);
            sleep(2500);
            Scanner fim = new Scanner(System.in);
            cls();
        }
    }

    static void sleep(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
        }
    }

    static void br() {
        System.out.print("\n");
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void soma(double n1, double n2) {
        System.out.println(n1 + n2);
    }
    static void sub(double n1, double n2) {
        System.out.println(n1 - n2);
    }
    static void div(double n1, double n2) {
        System.out.println(n1 / n2);
    }
    static void mult(double n1, double n2) {
        System.out.println(n1 * n2);
    }
    static void rest(double n1, double n2) {
        System.out.println(n1 % n2);
    }

    static void calc(double n1, double n2) {
        cls();
        System.out.print("A soma é: ");
        soma(n1, n2);
        br();
        System.out.print("A subtração é: ");
        sub(n1, n2);
        br();
        System.out.print("A multiplicação é: ");
        mult(n1, n2);
        br();
        System.out.print("A divisão é: ");
        div(n1, n2);
        br();
        System.out.print("O resto da divisão é: ");
        rest(n1, n2);
        br();

    }


}
