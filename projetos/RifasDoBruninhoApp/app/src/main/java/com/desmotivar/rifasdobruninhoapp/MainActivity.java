package com.desmotivar.rifasdobruninhoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        botao = findViewById(R.id.rifa001);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityRifaR();

            }
        });
    }

    private void ActivityRifaR() {

        Intent intent = new Intent(MainActivity.this, rifa001.class);
        startActivity(intent);

    }

}