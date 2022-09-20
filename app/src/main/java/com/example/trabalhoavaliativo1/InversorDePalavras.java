package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InversorDePalavras extends AppCompatActivity {
    Button IDPbtn1;
    EditText IDPed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inversor_de_palavras);
        IDPbtn1 = findViewById(R.id.IDPbtn1);
        IDPed1 = findViewById(R.id.IDPed1);

        IDPbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(IDPed1.getText().equals("")) && IDPed1.getText().length() >=2) {
                    Intent i = new Intent(InversorDePalavras.this, InversorDePalavrasTela2.class);
                    i.putExtra("texto",IDPed1.getText().toString());
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(InversorDePalavras.this,
                            "O campo precisa ter DOIS(2) ou mais CARACTERES",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });
    }
}