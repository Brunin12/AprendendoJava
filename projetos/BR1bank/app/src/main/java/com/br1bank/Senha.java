package com.br1bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Senha extends AppCompatActivity {

    private EditText senha;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        getSupportActionBar().hide();

        senha = findViewById(R.id.senha);
        botao = findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int senha_cadastrada = 161744;
                int senha_atual;

                senha_atual = Integer.parseInt(senha.getText().toString());

                if (senha_atual == senha_cadastrada) {
                    Toast.makeText(Senha.this, "Senha Correta", Toast.LENGTH_SHORT).show();
                    ActivityMain();
                } else {
                    Toast.makeText(Senha.this, "Senha Errada", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private void ActivityMain() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}