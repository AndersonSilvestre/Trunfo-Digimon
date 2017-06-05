package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anderson on 29/05/2017.
 */

public class escolha_2 extends AppCompatActivity {
    private Button btn_força_2;
    private Button btn_inteligencia_2;
    private Button btn_velocidade_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.escolha_2);

        btn_velocidade_2 = (Button) findViewById(R.id.btn_velocidade_2);
        if(Score.contador4==3){
            btn_velocidade_2.setEnabled(false);
            btn_velocidade_2.setBackgroundColor(Color.parseColor("#3C77FC"));
        }
        btn_velocidade_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador4++;
                Intent ir = new Intent(getBaseContext(), velocidade_2.class);
                ir.putExtra("pao","VELOCIDADE");
                startActivity(ir);
            }
        });

        btn_força_2 = (Button) findViewById(R.id.btn_forca_2);
        if(Score.contador5==3){
            btn_força_2.setEnabled(false);
            btn_força_2.setBackgroundColor(Color.parseColor("#3C77FC"));
        }
        btn_força_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador5++;
                Intent ir = new Intent(getBaseContext(), velocidade_2.class);
                ir.putExtra("pao","FORÇA");
                startActivity(ir);
            }
        });

        btn_inteligencia_2 = (Button) findViewById(R.id.btn_inteligencia_2);
        if(Score.contador6==3){
            btn_inteligencia_2.setEnabled(false);
            btn_inteligencia_2.setBackgroundColor(Color.parseColor("#3C77FC"));
        }
        btn_inteligencia_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador6++;
                Intent ir = new Intent(getBaseContext(), velocidade_2.class);
                ir.putExtra("pao","INTELIGÊNCIA");
                startActivity(ir);
            }
        });
    }
}