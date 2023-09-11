package co.brunoparreira.carros;

public class Ferrari {
    public static int rodas;
    public static double velocidadeMax;
    public static String dono;
    public static String modelo;
    public static int ano;

    public static void show() {
        System.out.println("Carro: Modelo: Ferrari KAR´S\nModelo: " + Ferrari.modelo);
        System.out.println("Dono: " + Ferrari.dono);
        System.out.println("Velocidade Maxima: " + Ferrari.velocidadeMax+"KM/h");
        System.out.println("Rodas: " + Ferrari.rodas);
    }

    public static String getDono() {
        return Ferrari.dono;
    }

    public static String getModelo() {
        return Ferrari.modelo;
    }

    public static double getVelMax() {
        return Ferrari.velocidadeMax;
    }

    public static int getRodas() {
        return Ferrari.rodas;
    }

    public static int getAno() {
        return ano;
    }

    public static void setDono(String dono) {
        Ferrari.dono = dono;
    }

    public static void setRodas(int rodas) {
        Ferrari.rodas = rodas;
    }

    public static void setAno(int ano) {
        Ferrari.ano = ano;
    }
    public Ferrari(int Ano, int rodas, String modelo, String dono, double maxVel ) {
        setAno(Ano);
        setDono(dono);
        setModelo(modelo);
        setRodas(rodas);
        setVelocidadeMax(maxVel);
    }


    public static void setVelocidadeMax(double velocidadeMax) {
        Ferrari.velocidadeMax = velocidadeMax;
    }

    public static void setModelo(String modelo) {
        Ferrari.modelo = modelo;
    }
}
