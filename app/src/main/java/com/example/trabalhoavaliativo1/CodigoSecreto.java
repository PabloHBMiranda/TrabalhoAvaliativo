package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodigoSecreto extends AppCompatActivity {

    public int Alt(int x ,Random r){
        int aux = x;
        while(x == aux){
            aux = r.nextInt(26);
        }
        return aux;
    }
    public String SetarTexto(String l, String x1, String x2, String x3, String x4, int i,TextView txt, EditText edt){
        txt.setText(l);
        if(l.equals(x1)||l.equals(x2)||l.equals(x3)||l.equals(x4)){
            if(i == 0){
                if(l.equals(x1)){
                    txt.setTextColor(Color.GREEN);
                    l+="(G) ";
                }
                else{
                    txt.setTextColor(Color.YELLOW);
                    l += "(Y) ";
                }
            }
            else{
                if(i == 1){
                    if(l.equals(x2)){
                        txt.setTextColor(Color.GREEN);
                        l+="(G) ";
                    }
                    else{
                        txt.setTextColor(Color.YELLOW);
                        l += "(Y) ";
                    }
                }
                else{
                    if(i==2){
                        if(l.equals(x3)){
                            txt.setTextColor(Color.GREEN);
                            l+="(G) ";
                        }
                        else{
                            txt.setTextColor(Color.YELLOW);
                            l += "(Y) ";
                        }
                    }
                    else{
                        if(l.equals(x4)){
                            txt.setTextColor(Color.GREEN);
                            l+="(G) ";
                        }
                        else{
                            txt.setTextColor(Color.YELLOW);
                            l += "(Y) ";
                        }
                    }
                }
            }
        }
        else{
            txt.setTextColor(Color.RED);
            l += "(R) ";
        }
        edt.setText("");
        return l;
    }

    Button CDSCRTbtn1, CDSCRTbtn2;
    EditText CDSCRTLYed1, CDSCRTLYed2, CDSCRTLYed3, CDSCRTLYed4;
    TextView CDSCRTL2txt1, CDSCRTL2txt2, CDSCRTL2txt3, CDSCRTL2txt4, CDSCRTtxt1;
    ListView CDSCRTlist1;
    List<String> lista;
    ArrayAdapter adapter;
    String x1="A",x2="B",x3="C",x4="D";
    String ED1, ED2, ED3, ED4;
    Random r = new Random();
    int k = 1;
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
        CDSCRTlist1 = findViewById(R.id.CDSCRTlist1);
        CDSCRTtxt1 = findViewById(R.id.CDSCRTtxt1);
        lista = new ArrayList<>();
        adapter = new ArrayAdapter(CodigoSecreto.this, android.R.layout.simple_list_item_1,lista);
        CDSCRTlist1.setAdapter(adapter);

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        //TextView texto;
        //texto.setTextColor(Color.);
        int x = r.nextInt(26);
        x1 = String.valueOf(letras.charAt(x));
        x = Alt(x,r);
        x2 = String.valueOf(letras.charAt(x));
        x = Alt(x,r);
        x3 = String.valueOf(letras.charAt(x));
        x = Alt(x,r);
        x4 = String.valueOf(letras.charAt(x));

       CDSCRTbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!CDSCRTLYed1.getText().toString().isEmpty() && !CDSCRTLYed2.getText().toString().isEmpty() && !CDSCRTLYed3.getText().toString().isEmpty()
                && !CDSCRTLYed4.getText().toString().isEmpty()){
                    ED1 = CDSCRTLYed1.getText().toString().toUpperCase();
                    ED2 = CDSCRTLYed2.getText().toString().toUpperCase();
                    ED3 = CDSCRTLYed3.getText().toString().toUpperCase();
                    ED4 = CDSCRTLYed4.getText().toString().toUpperCase();
                    k++;
                    if(x1.equals(ED1) && x2.equals(ED2) && x3.equals(ED3) && x4.equals(ED4)){
                        Intent i = new Intent(CodigoSecreto.this,CodigoSecreto2.class);
                        String palavra = x1+x2+x3+x4;
                        i.putExtra("TENTATIVAS",k);
                        i.putExtra("PALAVRA", palavra);
                        startActivity(i);
                        finish();
                    }
                    else {
                        ED1 = SetarTexto(ED1, x1, x2, x3, x4, 0, CDSCRTL2txt1, CDSCRTLYed1);
                        ED2 = SetarTexto(ED2, x1, x2, x3, x4, 1, CDSCRTL2txt2, CDSCRTLYed2);
                        ED3 = SetarTexto(ED3, x1, x2, x3, x4, 2, CDSCRTL2txt3, CDSCRTLYed3);
                        ED4 = SetarTexto(ED4, x1, x2, x3, x4, 3, CDSCRTL2txt4, CDSCRTLYed4);
                        String textoF = k + "?? TENTATIVA: " + ED1 + ED2 + ED3 + ED4;
                        lista.add(textoF);
                        adapter.notifyDataSetChanged();
                        CDSCRTtxt1.setText("TENTATIVAS: " + k);
                    }
                }
                else{
                    Toast.makeText(CodigoSecreto.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
                }
            }
        });
        /* PARTE PARA EFETUAR TESTES NO C??DIGO
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