package com.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button calc;
    EditText max;
    EditText min;
    TextView display;

    Random rd = new Random();

    int maxV;
    int minV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        calc = findViewById(R.id.btn);
        max = findViewById(R.id.max);
        min = findViewById(R.id.min);
        display = findViewById(R.id.display);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maxV = Integer.parseInt(String.valueOf(max.getText()));
                minV = Integer.parseInt(String.valueOf(min.getText()));

                int num = rd.nextInt(maxV);
                display.setText("Numero: " + num);
            }
        });
    }
}