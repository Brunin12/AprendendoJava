package com.curso.aperendendojavapoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro carro = new Carro("Azul", "Honda", 4);

        carro.mostra();
        carro.acelerar(10.5);
        System.out.println("Velocidade: " + carro.getVel());
        carro.freiar();
        System.out.println("Velocidade: " + carro.getVel());

        carro.setCor("amarelo");
        System.out.println("Cor: " + carro.getCor());

    }
}