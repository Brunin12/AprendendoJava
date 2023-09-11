

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rifa_sorter {
    public static void main(String[] args) {
        
        var i = 0;
        while (i == 0) {
            int min = Integer.parseInt(input("qual o valor minimo da rifa"));

            int max = Integer.parseInt(input("qual o valor maximo da rifa"));

            int indsN = Integer.parseInt(input("quantos numeros foram comprados?"));

            var comprados = new int[max];
            for (int y = 1; y < indsN + 1; y++) {
                comprados[y] = Integer.parseInt(input("digite o " + y + " numero comprado"));
            }

            int x = 0;
            var nums = new int[max];
            while (x < max) {

                if (!findInt(x, comprados)) {
                    nums[x] = x;
                }

                x++;
            }

            Random random = new Random();
            if (min > max) {
                max = min;
            }
            if (min == max) {
                max++;
            }
            int numero = -884343;
            while (true) {
                numero = random.nextInt(min, max);
                if (findInt(numero, comprados) == false) {
                    break;
                }
            }
            System.out.println("numeros possiveis:");
            for (int y : nums) {
                if (nums[y] != -1) {
                    System.out.print(y + "; ");
                }
            }
            System.out.println("GERANDO....");
            sleep(500);
            
            System.out.println("o numero sorteado foi: " + numero);
            

            var sair = input("deseja sair? S/N").toUpperCase(Locale.ROOT);
            if (sair.equals("S") || sair.equals("SIM") || sair.equals("SAIR")) {
                i = 1;
            } else {
                System.out.println("CONTINUANDO...");

                sleep(700);
            }
        }
    }

    static void sleep(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
        }
    }


    static String input(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    static boolean findInt(int value, int[] Array) {
        boolean found = false;


        for(int x : Array){
            if(x == value){
                return true;
            }
        }
        return false;
    }

}
