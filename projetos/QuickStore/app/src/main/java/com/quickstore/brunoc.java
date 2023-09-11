package com.quickstore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class brunoc extends AppCompatActivity {

    String urk;

    private static final int PERMISSION_STORAGE_CODE = 1000;

    Button frases_mot, frases_des, banco, rifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brunoc);

        frases_mot = findViewById(R.id.frases_mot);
        frases_des = findViewById(R.id.frases_des);
        banco = findViewById(R.id.banco);
        rifa = findViewById(R.id.rifa);

        frases_mot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dowload("https://brunin13.github.io/quickstore/midia/app_motivacional.apk", "Instalando");
            }
        });

        frases_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dowload("https://brunin13.github.io/quickstore/midia/desmotivador.apk", "Instalando");
            }
        });

        banco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dowload("https://brunin13.github.io/quickstore/midia/banco_br1", "Instalando");
            }
        });

        rifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dowload("https://brunin13.github.io/quickstore/midia/rifa_app_brunin.apk", "Instalando");
            }
        });


    }

    private void Dowload(String url, String titulo)
    {
        alert("Instalando o App....");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
            PackageManager.PERMISSION_DENIED
            ) {
                // permição recusada
                alert("permissão recusada");
                String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permissions, PERMISSION_STORAGE_CODE);
            } else {
                // permição aceita
                alert("permissão recusada");
                startDowloading(url, titulo);
            }
        } else {
            startDowloading(url, titulo);
        }
    }

    private void startDowloading(String url, String titulo) {
        url = url.trim();

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle(titulo);
        request.setDescription("Instalando Aplicativo.....");

        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, ""+System.currentTimeMillis());

        DownloadManager manager = (DownloadManager)getSystemService((Context.DOWNLOAD_SERVICE));
        manager.enqueue(request);
    }

    private void alert(String msg) {
        Toast.makeText(brunoc.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startDowloading(urk, "Dowload");
                } else {
                    alert("Permissão Negada...!");
                }
            }
        }

    }
}