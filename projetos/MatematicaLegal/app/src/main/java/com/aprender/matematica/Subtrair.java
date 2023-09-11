package com.aprender.matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Subtrair extends AppCompatActivity {

    private Button subtrair;
    private EditText n1;
    private EditText n2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtrair);

        getSupportActionBar().hide();

        subtrair = findViewById(R.id.vamos2);
        resultado = findViewById(R.id.resultado);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);


        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular(n1, n2);
            }
        });
    }


    private void calcular(EditText n1, EditText n2) {

        int n1v = Integer.parseInt(String.valueOf(n1.getText()));
        int n2v = Integer.parseInt(String.valueOf(n2.getText()));
        int result = n1v - n2v;


        resultado.setText("Resultado: " + n1v + " - " + n2v + " = " + result);
        Toast.makeText(Subtrair.this, ("Resultado: " + n1v + " - " + n2v + " = " + result), Toast.LENGTH_SHORT).show();

    }
}