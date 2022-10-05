package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PedraPapelTesoura2 extends AppCompatActivity {
    Button MENU;
    TextView v2, e2, d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedra_papel_tesoura2);
        MENU = findViewById(R.id.MENU);
        v2 = findViewById(R.id.v2);
        e2 = findViewById(R.id.e2);
        d2 = findViewById(R.id.d2);

        Intent receberdados = getIntent();

        v2.setText("VITORIA: " + receberdados.getIntExtra("V",0));
        e2.setText("EMPATE: " + receberdados.getIntExtra("E",0));
        d2.setText("DERROTA: " + receberdados.getIntExtra("D",0));

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PedraPapelTesoura2.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}