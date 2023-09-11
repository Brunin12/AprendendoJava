package com.quickstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        botao1 = findViewById(R.id.brunin12);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bruno();

            }
        });
    }

    private void bruno() {
        Intent intent = new Intent(MainActivity.this, brunoc.class);
        startActivity(intent);
    }

}