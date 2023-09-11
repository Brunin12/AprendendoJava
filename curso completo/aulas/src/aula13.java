import java.util.Scanner;

// import static co.brunoparreira.utils.usm.*;

public class aula13 {
    public static void main(String[] args) {
        // converter tipos primitivos
        //(casting)
        float dd = 10.12f;
        int ii = 57;

        double x = (double) ii / dd;

        System.out.println(x);


        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        int z = (int) sc.nextDouble();

        System.out.println(z);

    }
}
