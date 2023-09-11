public class aula14 {
    public static void main(String[] args) {
        // MANIPULANDO STRINGS

        String x = "  Ola Mundo, Esse é o Meu Mundo  ".trim();
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.contains("Mundo"));
        System.out.println(x.strip());
        System.out.println(x.indexOf("Mundo"));
        System.out.println(x.lastIndexOf("mundo"));
        System.out.println(x + " soq é parte 2");
        System.out.println(x.substring(11));

        System.out.println(x.equals("Ola Mundo"));





    }
}
