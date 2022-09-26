package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaTela extends AppCompatActivity {
    Button T2btn1, T2btn2, T2btn3, T2btn4, fechar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        T2btn1 = findViewById(R.id.T2btn1);
        T2btn2 = findViewById(R.id.T2btn2);
        T2btn3 = findViewById(R.id.T2btn3);
        T2btn4 = findViewById(R.id.T2btn4);
        fechar = findViewById(R.id.fechar);

        T2btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundaTela.this, InversorDePalavras.class);
                startActivity(i);
                finish();
            }
        });
        T2btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundaTela.this, PedraPapelTesoura.class);
                startActivity(i);
                finish();
            }
        });
        T2btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundaTela.this, CodigoSecreto.class);
                startActivity(i);
                finish();
            }
        });

        T2btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SegundaTela.this, Rand.class);
                startActivity(i);
                finish();
            }
        });

        fechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}