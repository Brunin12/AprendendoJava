package com.desmotivar.rifasdobruninhoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class introActivivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_activivty);

        getSupportActionBar().hide();

        new Handler()
                .postDelayed(
                        new Runnable() {
                            @Override
                            public void run() {
                                ActivityMain();
                            }
                        },
                        3500);

    }

    private void ActivityMain() {

        Intent intent = new Intent(introActivivty.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}