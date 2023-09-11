package com.desmotivar.rifasdobruninhoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class rifa001 extends AppCompatActivity {

    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rifa001);

        getSupportActionBar().hide();

        botao = findViewById(R.id.saiba_mais);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/rifabmpa")));
            }
        });
    }
}