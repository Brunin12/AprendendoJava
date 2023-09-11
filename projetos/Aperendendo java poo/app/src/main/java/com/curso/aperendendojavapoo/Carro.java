package com.curso.aperendendojavapoo;

public class Carro extends Veiculo {

    public Carro(String cor, String marca, int rodas) {
        super(cor, marca, rodas);
    }

    @Override
    public void acelerar(double vel) {
        System.out.println("O carro acelerou!");
        setVel(vel);
    }

    @Override
    public void freiar() {
        System.out.println("O carro freiou!");
        setVel(0.0);
    }

}