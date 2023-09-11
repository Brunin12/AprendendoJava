public class aula4 {
    public static void main(String[] args) {
        sum(154, 60);
        sum(60, 70);
        System.out.print("\n");
        sum(14, 6);
        sum(80, 30);

        calc(3, 5);

    }

    static void print(String msg) {
        System.out.println(msg);
    }

    static void sum(double n1, double n2) {
        System.out.println("soma de " + n1 + " com " + n2 + " = " + n1 + n2 );

    }

    static void calc(double n1, double n2) {
        System.out.println("soma de " + n1 + " com " + n2 + " = " + n1 + n2 );
        System.out.println("subtração de " + n1 + " com " + n2 + " = " + (n1 - n2));
        System.out.println("divisão de " + n1 + " com " + n2 + " = " + n1 / n2 );
        System.out.println("multiplicação de " + n1 + " com " + n2 + " = " + n1 * n2 );

    }


}
