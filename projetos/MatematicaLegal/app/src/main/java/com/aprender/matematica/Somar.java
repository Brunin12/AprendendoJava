package com.aprender.matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Somar extends AppCompatActivity {

    private Button somar;
    private EditText n1;
    private EditText n2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.somar);

        getSupportActionBar().hide();

        somar = findViewById(R.id.vamos2);
        resultado = findViewById(R.id.resultado);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);


        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular(n1, n2);
            }
        });
    }


    private void calcular(EditText n1, EditText n2) {

        int n1v = Integer.parseInt(String.valueOf(n1.getText()));
        int n2v = Integer.parseInt(String.valueOf(n2.getText()));
        char letra = '|';

        int result = n1v + n2v;


        resultado.setText("Resultado: " + letra.repeat(n1v) + " + " + n2v + " = " + result);
        System.out.println(letra.repeat(5));
        Toast.makeText(Somar.this, ("Resultado: " + n1v + " + " + n2v + " = " + result), Toast.LENGTH_SHORT).show();


    }

    private String repeat(int n, char letra) {
        return "n" + 1;
    }


}