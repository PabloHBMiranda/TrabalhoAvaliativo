package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PedraPapelTesoura extends AppCompatActivity {

    public void IAgame(int r){
        switch (r){
            case 1:
                idIA.setImageResource(R.drawable.pedra);
                break;
            case 2:
                idIA.setImageResource(R.drawable.papel);
                break;
            default:
                idIA.setImageResource(R.drawable.tesoura);
                break;
       }
    }

    ImageView pedra, papel, tesoura, idVC, idIA;
    TextView idResu, vitoria, empate, derrota;
    Button PPTencerrar;
    int r;
    int V = 0, E = 0, D = 0;
    Random rx = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedra_papel_tesoura);
        pedra = findViewById(R.id.pedra);
        papel = findViewById(R.id.papel);
        tesoura = findViewById(R.id.tesoura);
        idResu = findViewById(R.id.idResu);
        vitoria = findViewById(R.id.vitoria);
        empate = findViewById(R.id.empate);
        derrota = findViewById(R.id.derrota);
        idVC = findViewById(R.id.idVC);
        idIA = findViewById(R.id.idIA);
        PPTencerrar = findViewById(R.id.PPTencerrar);

        vitoria.setText("VITÓRIAS: " + V);
        empate.setText("EMPATES: "+E);
        derrota.setText("DERROTAS: "+D);

        PPTencerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PedraPapelTesoura.this, PedraPapelTesoura2.class);
                i.putExtra("V",V);
                i.putExtra("E",E);
                i.putExtra("D",D);
                startActivity(i);
                finish();
            }
        });

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idVC.setImageResource(R.drawable.pedra);
                r = rx.nextInt(3);
                IAgame(r);
                if(r == 1){
                    idResu.setText("EMPATE");
                    E++;
                    empate.setText("EMPATES: "+E);
                }
                else{
                    if(r == 2){
                        idResu.setText("DERROTA");
                        D++;
                        derrota.setText("DERROTAS: "+D);
                    }
                    else{
                        idResu.setText("VITORIA");
                        V++;
                        vitoria.setText("VITÓRIAS: " + V);
                    }
                }
            }
        });

        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idVC.setImageResource(R.drawable.papel);
                r = rx.nextInt(3);
                IAgame(r);
                if(r == 1){
                    idResu.setText("VITORIA");
                    V++;
                    vitoria.setText("VITÓRIAS: " + V);
                }
                else{
                    if(r == 2){
                        idResu.setText("EMPATE");
                        E++;
                        empate.setText("EMPATES: "+E);
                    }
                    else{
                        idResu.setText("DERROTA");
                        D++;
                        derrota.setText("DERROTAS: "+D);
                    }
                }
            }
        });

        tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idVC.setImageResource(R.drawable.tesoura);
                r = rx.nextInt(3);
                IAgame(r);
                if(r == 1){
                    idResu.setText("DERROTA");
                    D++;
                    derrota.setText("DERROTAS: "+D);
                }
                else{
                    if(r == 2){
                        idResu.setText("VITORIA");
                        V++;
                        vitoria.setText("VITÓRIAS: " + V);
                    }
                    else{
                        idResu.setText("EMPATE");
                        E++;
                        empate.setText("EMPATES: "+E);
                    }
                }
            }
        });
    }
}