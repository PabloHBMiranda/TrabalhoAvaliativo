package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PedraPapelTesoura extends AppCompatActivity {
    ImageView pedra, papel, tesoura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedra_papel_tesoura);
        pedra = findViewById(R.id.pedra);
        papel = findViewById(R.id.papel);
        tesoura = findViewById(R.id.tesoura);

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int choice = 1;
                Intent i = new Intent(PedraPapelTesoura.this, PedraPapelTesoura2.class);
                i.putExtra("choice",choice);
                startActivity(i);
                finish();
            }
        });
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int choice = 2;
                Intent i = new Intent(PedraPapelTesoura.this, PedraPapelTesoura2.class);
                i.putExtra("choice",choice);
                startActivity(i);
                finish();
            }
        });
        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int choice = 3;
                Intent i = new Intent(PedraPapelTesoura.this, PedraPapelTesoura2.class);
                i.putExtra("choice",choice);
                startActivity(i);
                finish();
            }
        });
    }
}