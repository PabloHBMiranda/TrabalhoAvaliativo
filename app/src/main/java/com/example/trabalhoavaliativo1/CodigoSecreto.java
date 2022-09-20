package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CodigoSecreto extends AppCompatActivity {

    public void SetarTexto(){

    }

    Button CDSCRTbtn1, CDSCRTbtn2;
    EditText CDSCRTLYed1, CDSCRTLYed2, CDSCRTLYed3, CDSCRTLYed4;
    TextView CDSCRTL2txt1, CDSCRTL2txt2, CDSCRTL2txt3, CDSCRTL2txt4;
    String resultado = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_secreto);
        CDSCRTbtn1 = findViewById(R.id.CDSCRTbtn1);
        CDSCRTbtn2 = findViewById(R.id.CDSCRTbtn2);
        CDSCRTLYed1 = findViewById(R.id.CDSCRTLYed1);
        CDSCRTLYed2 = findViewById(R.id.CDSCRTLYed2);
        CDSCRTLYed3 = findViewById(R.id.CDSCRTLYed3);
        CDSCRTLYed4 = findViewById(R.id.CDSCRTLYed4);
        CDSCRTL2txt1 = findViewById(R.id.CDSCRTL2txt1);
        CDSCRTL2txt2 = findViewById(R.id.CDSCRTL2txt2);
        CDSCRTL2txt3 = findViewById(R.id.CDSCRTL2txt3);
        CDSCRTL2txt4 = findViewById(R.id.CDSCRTL2txt4);

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        //TextView texto;
        //texto.setTextColor(Color.);
        for(int i = 0; i < 4; i++){
            int x = r.nextInt(26);
            resultado += letras.charAt(x);
        }
       CDSCRTbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(CDSCRTLYed1.getText().equals("")) && !(CDSCRTLYed2.getText().equals("")) && !(CDSCRTLYed3.getText().equals(""))
                && !(CDSCRTLYed4.getText().equals(""))){
                    String ED1, ED2, ED3, ED4;
                    ED1 = CDSCRTLYed1.getText().toString().toUpperCase();
                    ED2 = CDSCRTLYed2.getText().toString().toUpperCase();
                    ED3 = CDSCRTLYed3.getText().toString().toUpperCase();
                    ED4 = CDSCRTLYed4.getText().toString().toUpperCase();
                    if(ED1.equals(resultado.charAt(0))){
                    }
                }
                else{
                    Toast.makeText(CodigoSecreto.this, "Preencha todos os campos", Toast.LENGTH_LONG);
                }
            }
        });
        /* PARTE PARA EFETUAR TESTES NO CÓDIGO
        CDSCRTbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x;
                x = CDSCRTLYed1.getText().toString().toUpperCase();
                CDSCRTL2txt1.setText(x);
            }
        });*/
        CDSCRTbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CodigoSecreto.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}