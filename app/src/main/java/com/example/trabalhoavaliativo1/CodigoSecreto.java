package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CodigoSecreto extends AppCompatActivity {

    public void SetarTexto(String l, String x1, String x2, String x3, String x4, int i,TextView txt){
        txt.setText(l);
        if(l.equals(x1)||l.equals(x2)||l.equals(x3)||l.equals(x4)){
            if(i == 0){
                if(l.equals(x1)){
                    txt.setTextColor(Color.GREEN);
                }
                else{
                    txt.setTextColor(Color.YELLOW);
                }
            }
            else{
                if(i == 1){
                    if(l.equals(x2)){
                        txt.setTextColor(Color.GREEN);
                    }
                    else{
                        txt.setTextColor(Color.YELLOW);
                    }
                }
                else{
                    if(i==2){
                        if(l.equals(x3)){
                            txt.setTextColor(Color.GREEN);
                        }
                        else{
                            txt.setTextColor(Color.YELLOW);
                        }
                    }
                    else{
                        if(l.equals(x4)){
                            txt.setTextColor(Color.GREEN);
                        }
                        else{
                            txt.setTextColor(Color.YELLOW);
                        }
                    }
                }
            }
        }
        else{
            txt.setTextColor(Color.RED);
        }
    }

    Button CDSCRTbtn1, CDSCRTbtn2;
    EditText CDSCRTLYed1, CDSCRTLYed2, CDSCRTLYed3, CDSCRTLYed4;
    TextView CDSCRTL2txt1, CDSCRTL2txt2, CDSCRTL2txt3, CDSCRTL2txt4;
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
        String x1="A",x2="B",x3="C",x4="D";
        String resultado = "ABCD";
        //TextView texto;
        //texto.setTextColor(Color.);
       /* int x = r.nextInt(26);
        x1 = letras.charAt(x);
        x = r.nextInt(26);
        x2 = letras.charAt(x);
        x = r.nextInt(26);
        x3 = letras.charAt(x);
        x = r.nextInt(26);
        x4 = letras.charAt(x);*/
       CDSCRTbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!CDSCRTLYed1.getText().toString().isEmpty() && !CDSCRTLYed2.getText().toString().isEmpty() && !CDSCRTLYed3.getText().toString().isEmpty()
                && !CDSCRTLYed4.getText().toString().isEmpty()){
                    String ED1, ED2, ED3, ED4;
                    ED1 = CDSCRTLYed1.getText().toString().toUpperCase();
                    ED2 = CDSCRTLYed2.getText().toString().toUpperCase();
                    ED3 = CDSCRTLYed3.getText().toString().toUpperCase();
                    ED4 = CDSCRTLYed4.getText().toString().toUpperCase();
                    SetarTexto(ED1,x1, x2,x3,x4,0,CDSCRTL2txt1);
                    SetarTexto(ED2,x1, x2,x3,x4,1,CDSCRTL2txt2);
                    SetarTexto(ED3,x1, x2,x3,x4,2,CDSCRTL2txt3);
                    SetarTexto(ED4,x1, x2,x3,x4,3,CDSCRTL2txt4);
                }
                else{
                    Toast.makeText(CodigoSecreto.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
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