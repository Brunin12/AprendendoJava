package com.aprender.matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button somar;
    Button subtrair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        somar = findViewById(R.id.somar);
        subtrair = findViewById(R.id.subtrair);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soma();
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtrair();
            }
        });
    }


    private void soma() {

        Intent intent = new Intent(MainActivity.this, Somar.class);
        startActivity(intent);
        finish();

    }

    private void subtrair() {

        Intent intent = new Intent(MainActivity.this, Subtrair.class);
        startActivity(intent);
        finish();

    }
}