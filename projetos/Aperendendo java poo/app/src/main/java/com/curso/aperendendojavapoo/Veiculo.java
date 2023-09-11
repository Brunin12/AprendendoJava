package com.curso.aperendendojavapoo;

public class Veiculo {
    private String cor;
    private String marca;
    private int rodas;
    private double vel;

    public Veiculo(String cor, String marca, int rodas) {
        this.cor = cor;
        this.marca = marca;
        this.rodas = rodas;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getRodas(){
        return this.rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public double getVel() {
        return this.vel;
    }

    public void setVel(Double vel) {
        this.vel = vel;
    }

    public void acelerar(double vel) {
        System.out.println("O veiculo acelerou!");
        setVel(vel);
    }

    public void freiar() {
        System.out.println("O veiculo freiou!");
        setVel(0.0);
    }


    public void mostra() {
        System.out.println("Cor: " + getCor());
        System.out.println("Velocidade: " + getVel() + "KM/h");
        System.out.println("Marca: " + getMarca());
        System.out.println("Rodas: " + getRodas());

    }

}
