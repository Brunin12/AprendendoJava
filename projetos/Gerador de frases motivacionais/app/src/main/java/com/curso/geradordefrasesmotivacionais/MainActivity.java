package com.curso.geradordefrasesmotivacionais;
// Author: Brunin12
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] frasesMotivacionais = {
                "Correr atrás é sempre a melhor forma de conseguir.",
                "Acreditar é a força que nos permite subir os maiores degraus na escada da vida.",
                "Alcançar o que se deseja dá trabalho, mas não pare de lutar porque está cansado",
                "Muitas vezes a vida é arriscar tudo por algo que ninguém mais pode ver além de você. Acredite nos seus sonhos!",
                "Na vida o que realmente vale a pena demora e custa a alcançar, por isso não desista à primeira dificuldade.",
                "Sorte é o que acontece quando a preparação encontra a oportunidade.",
                "Eu quero, eu posso, eu consigo. Com isso em mente sou imparável",
                "Sonhe alto e trabalhe com a mesma preparação para alcançar seus melhores resultados",
                "De cabeça erguida e peito estufado, dou boas-vindas ao futuro que me aguarda. \uD83D\uDCAA",
                "Não existe maior talento que um coração corajoso e determinado.",
                "Só uma coisa torna um sonho impossível: o medo de fracassar.",
                "Dispense qualquer fraqueza, entregue-se à coragem e corra atrás dos seus sonhos.",
                "Nada é impossível para quem tem ambição de vencer.",
                "Acredite, mas faça mais do que isso: lute até ao fim.",
                "Quando nada mais fizer sentido, saiba que Ele irá lhe proteger.",
                "Qualquer objetivo pode ser atingível.",
        };

        frases = findViewById(R.id.frases);
        botao = findViewById(R.id.botao);

        getSupportActionBar().hide(); // Esconder a barra do texto

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                int numeroAleatorio = random.nextInt(frasesMotivacionais.length);

                frases.setText(frasesMotivacionais[numeroAleatorio]);

            }
        });

    }
}