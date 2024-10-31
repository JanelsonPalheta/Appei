package com.biomaamazonia.appei;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mapaButton = findViewById(R.id.buttonMapa);
        Button faunaFloraButton = findViewById(R.id.buttonFaunaFlora);
        Button quizButton = findViewById(R.id.buttonQuiz);
        Button importanciaAmazoniaButton = findViewById(R.id.buttonImportanciaAmazonia);
        Button sustentabilidadeButton = findViewById(R.id.buttonSustentabilidade);

        mapaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapaActivity.class);
                startActivity(intent);
            }
        });

        faunaFloraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FaunaFloraActivity.class);
                startActivity(intent);
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });

        importanciaAmazoniaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImportanciaAmazoniaActivity.class);
                startActivity(intent);
            }
        });

        sustentabilidadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SustentabilidadeActivity.class);
                startActivity(intent);
            }
        });
    }
}
