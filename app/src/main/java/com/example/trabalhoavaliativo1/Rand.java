package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class Rand extends AppCompatActivity {

    TextView randtxt3;
    EditText randed1;
    ListView randlist1;
    Button randbtn1, randbtn2, randbtn3, randbtn4;
    List<String> lista;
    ArrayAdapter adapter;
    int k = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rand);
        randtxt3 = findViewById(R.id.randtxt3);
        randed1 = findViewById(R.id.randed1);
        randlist1 = findViewById(R.id.randlist1);
        randbtn1 = findViewById(R.id.randbtn1);
        randbtn2 = findViewById(R.id.randbtn2);
        randbtn3 = findViewById(R.id.randbtn3);
        randbtn4 = findViewById(R.id.randtn4);

        lista = new ArrayList<>();
        adapter = new ArrayAdapter(Rand.this, android.R.layout.simple_list_item_1,lista);
        randlist1.setAdapter(adapter);

        randbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!randed1.getText().toString().isEmpty()){
                    lista.add(randed1.getText().toString());
                    adapter.notifyDataSetChanged();
                    k++;
                    randed1.setText("");
                }
                else{
                    Toast.makeText(Rand.this, "Preencha o campo.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        randbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lista.isEmpty()){
                    lista.clear();
                    adapter.notifyDataSetChanged();
                    k = 0;
                    randtxt3.setText("????");
                }
                else{
                    Toast.makeText(Rand.this, "Lista vazia. Insira algum valor.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        randbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lista.isEmpty()){
                    int x;
                    Random r = new Random();
                    x = r.nextInt(k);
                    randtxt3.setText(lista.get(x));
                }
                else{
                    Toast.makeText(Rand.this, "Lista vazia. Insira algum valor.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        randbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Rand.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}