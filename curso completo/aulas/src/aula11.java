import static co.brunoparreira.utils.usm.*;

public class aula11 {


    // int x; LOCAL
    // static int x; Global V2
    public static int x; // Global V3

    public static void main(String[] args) {
        // VISIBILIDADE DE ESCOPO

        cls();

        x = 10;
        System.out.println(x);
        x--;
        sum();
    }

    private static void sum() {
        System.out.println(x);
    }


}
