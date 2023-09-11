package com.desmotivar.ola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView texto;
    boolean click = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().hide();

        texto = findViewById(R.id.texto);
        btn = findViewById(R.id.mostrar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click) {
                    texto.setText("");
                    click = false;
                } else {
                    texto.setText("Ola Bruno!");
                    click = true;
                }
            }
        });

    }
}