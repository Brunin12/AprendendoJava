package co.brunoparreira.utils;

import java.util.Scanner;

public class usm {

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

        System.out.print("A soma é: ");
        soma(n1, n2);

        System.out.print("A subtração é: ");
        sub(n1, n2);

        System.out.print("A multiplicação é: ");
        mult(n1, n2);

        System.out.print("A divisão é: ");
        div(n1, n2);

        System.out.print("O resto da divisão é: ");
        rest(n1, n2);

    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void br() {
        System.out.print("\n");
    }

        static void sleep(int milisegundos) {
            try {
                Thread.sleep(milisegundos);
            } catch (InterruptedException ex) {
            }
        }



        public static void prints(String msg) {
            System.out.println("\n" + msg);
        }





        public static String input(String msg) {
            System.out.println(msg);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }




        public static void cls() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }


}
