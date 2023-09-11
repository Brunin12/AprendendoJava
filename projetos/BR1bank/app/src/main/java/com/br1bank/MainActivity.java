package com.br1bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText quantia;
    private Button sacar;
    private TextView saldo;

    double Dinheiro;
    double saldoReal = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        Iniciar();

        saldo.setText("Saldo Conta: R$ " + saldoReal);

    sacar.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Dinheiro = Integer.parseInt(quantia.getText().toString());
            if (Dinheiro <= saldoReal) {
              if (Dinheiro < 20) {

                Toast.makeText(
                        MainActivity.this,
                        "Não foi possivel sacar, (minimo para sacar = 20)",
                        Toast.LENGTH_LONG)
                    .show();
              } else if (Dinheiro == 20) {
                saldoReal -= Dinheiro;
                saldo.setText("Saldo Conta: R$ " + saldoReal);
                Toast.makeText(
                        MainActivity.this, "Você sacou " + Dinheiro + " Reais", Toast.LENGTH_SHORT)
                    .show();
              } else if (Dinheiro == 50) {
                saldoReal -= Dinheiro;
                saldo.setText("Saldo Conta: R$ " + saldoReal);
                Toast.makeText(
                        MainActivity.this, "Você sacou " + Dinheiro + " Reais", Toast.LENGTH_SHORT)
                    .show();
              } else if (Dinheiro == 100) {
                saldoReal -= Dinheiro;
                saldo.setText("Saldo Conta: R$ " + saldoReal);
                Toast.makeText(
                        MainActivity.this, "Você sacou " + Dinheiro + " Reais", Toast.LENGTH_SHORT)
                    .show();
              } else {

                saldoReal -= Dinheiro;
                saldo.setText("Saldo Conta: R$ " + saldoReal);
                Toast.makeText(
                        MainActivity.this, "Você sacou " + Dinheiro + "0 Reais", Toast.LENGTH_SHORT)
                    .show();
              }
            } else {
                Toast.makeText(MainActivity.this, "Saldo insuficiente", Toast.LENGTH_LONG);
            }
          }
        });
    }

    private void Iniciar() {
        quantia = findViewById(R.id.quantia);
        saldo = findViewById(R.id.saldo);
        sacar = findViewById(R.id.sacar);
    }

}