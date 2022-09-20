package com.example.trabalhoavaliativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PedraPapelTesoura2 extends AppCompatActivity {
    ImageView PPT2img1, PPT2img2;
    TextView PPT2txt3;
    Button PPT2btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedra_papel_tesoura2);
        PPT2img1 = findViewById(R.id.PPT2img1);
        PPT2img2 = findViewById(R.id.PPT2img2);
        PPT2txt3 = findViewById(R.id.PPT2txt3);
        PPT2btn1 = findViewById(R.id.PPT2btn1);

        Intent receberDados = getIntent();
        int choice = receberDados.getIntExtra("choice",0);
        int ia;
        Random r = new Random();
        ia = r.nextInt(3);

        switch (choice){
            case 1:
                PPT2img1.setImageResource(R.drawable.pedra);
                break;
            case 2:
                PPT2img1.setImageResource(R.drawable.papel);
                break;
            default:
                PPT2img1.setImageResource(R.drawable.tesoura);
                break;
        }

        switch (ia){
            case 1:
                PPT2img2.setImageResource(R.drawable.pedra);
                break;
            case 2:
                PPT2img2.setImageResource(R.drawable.papel);
                break;
            default:
                PPT2img2.setImageResource(R.drawable.tesoura);
                break;
        }

        if(choice == 1){
            if(ia == 1){
                PPT2txt3.setText("EMPATE!");
            }
            else{
                if(ia == 2){
                    PPT2txt3.setText("PERDEU!");
                }
                else{
                    PPT2txt3.setText("GANHOU!");
                }
            }
        }
        else{
            if(choice == 2){
                if(ia == 1){
                    PPT2txt3.setText("GANHOU!");
                }
                else{
                    if(ia == 2){
                        PPT2txt3.setText("EMPATE");
                    }
                    else{
                        PPT2txt3.setText("PERDEU!");
                    }
                }
            }
            else{
                if(ia == 1){
                    PPT2txt3.setText("PERDEU");
                }
                else{
                    if(ia == 2){
                        PPT2txt3.setText("GANHOU!");
                    }
                    else{
                        PPT2txt3.setText("EMPATE");
                    }
                }
            }
        }
        PPT2btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PedraPapelTesoura2.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });
    }
}