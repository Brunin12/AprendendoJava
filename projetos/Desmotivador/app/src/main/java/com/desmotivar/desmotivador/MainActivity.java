package com.desmotivar.desmotivador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        String[] frases = {
                "Tudo pode dar errado se você tentar. Mas se não fizer nada, tudo ficará igual",
                "A mãe da frustração é você acreditar que pode realizar seus sonhos sem ser herdeiro",
                "O meu trabalho dos sonhos seria ganhar para dormir. Enquanto não chego lá, me frustro com todos os outros trabalhos",
                "Sonhar é se frustrar porque alguém realizou seus sonhos mais rápido que você",
                "Os que não param de lutar estão sempre em busca da sua próxima derrota",
                "O importante é acreditar na derrota e talvez se surpreender com a vitória",
                "O desespero é o que move as pessoas, não a esperança",
                "Você não é especial e os outros também não são. Somos todos pessoas normais em busca do fracasso",
                "Não é falta de sorte, é incompetência",
                "Para não se decepcionar, apenas não confie em ninguém, nem em você mesmo. ",
                "A frustração me ensinou que fazer nada não gera sofrimento. ",
                "O caminho não fica mais difícil, você é que fica mais cansado e não aguenta mais.",
                "Acredite quando falarem que não vai dar certo porque as pessoas são mais inteligentes que você. ",
                "O empate é o melhor resultado porque ninguém sai perdendo.",
                "Todos esperam que você falhe. Então, lute até provar que eles estão certos.",
                "Não tenho pressa porque vai dar errado se eu correr ou não. Indo devagar, pelo menos poupo energia."
        };

        botao = findViewById(R.id.botao);
        display = findViewById(R.id.frase);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                int numeroAleatorio = random.nextInt(frases.length);


                display.setText(frases[numeroAleatorio]);
            }
        });

    }
}