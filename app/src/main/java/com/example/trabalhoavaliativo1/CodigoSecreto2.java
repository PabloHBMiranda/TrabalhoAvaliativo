package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CodigoSecreto2 extends AppCompatActivity {
    TextView CDSCRTL2txt1, CDSCRTL2txt2, CDSCRTL2txt3, CDSCRTL2txt4;
    Button CDSCRTL2bnt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_secreto2);
        CDSCRTL2txt1 = findViewById(R.id.CDSCRTL2txt1);
        CDSCRTL2txt2 = findViewById(R.id.CDSCRTL2txt2);
        CDSCRTL2txt3 = findViewById(R.id.CDSCRTL2txt3);
        CDSCRTL2txt4 = findViewById(R.id.CDSCRTL2txt4);
        CDSCRTL2bnt1 = findViewById(R.id.CDSCRTL2bnt1);

        Intent receberdados = getIntent();
        CDSCRTL2txt3.setText(receberdados.getStringExtra("PALAVRA"));
        CDSCRTL2txt4.setText("TOTAL DE TENTATIVAS: " + receberdados.getIntExtra("TENTATIVAS",0));
        CDSCRTL2bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CodigoSecreto2.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}