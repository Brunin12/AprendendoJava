package com.br1bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

    new Handler()
        .postDelayed(
            new Runnable() {
              @Override
              public void run() {
                  ActivitySenha();
              }
            },
            3500);
    }

    private void ActivitySenha() {

        Intent intent = new Intent(Splash.this, Senha.class);
        startActivity(intent);

    }


}