package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InversorDePalavrasTela2 extends AppCompatActivity {
    TextView IDP2ed1;
    Button IDP2btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversor_de_palavras_tela2);
        IDP2ed1 = findViewById(R.id.IDP2ed1);
        IDP2btn1 = findViewById(R.id.IDP2btn1);
        Intent receberDados = getIntent();
        String palavra = receberDados.getStringExtra("texto");
        String resultado = "";
        for(int x = palavra.length() -1;x>=0;x--){
            resultado = resultado + palavra.charAt(x);
        }
        IDP2ed1.setText(resultado);

        IDP2btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InversorDePalavrasTela2.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}