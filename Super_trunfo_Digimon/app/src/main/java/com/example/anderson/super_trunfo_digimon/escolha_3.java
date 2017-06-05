package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anderson on 30/05/2017.
 */

public class escolha_3 extends AppCompatActivity {

    private Button btn_força_3;
    private Button btn_inteligencia_3;
    private Button btn_velocidade_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.escolha_3);

        btn_velocidade_3 = (Button) findViewById(R.id.btn_velocidade_3);
        if(Score.contador7==3){
            btn_velocidade_3.setEnabled(false);
            btn_velocidade_3.setBackgroundColor(Color.parseColor("#C95808"));
        }
        btn_velocidade_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador7++;
                Intent ir = new Intent(getBaseContext(), velocidade_3.class);
                ir.putExtra("pao","VELOCIDADE");
                startActivity(ir);
            }
        });

        btn_força_3 = (Button) findViewById(R.id.btn_forca_3);
        if(Score.contador8==3){
            btn_força_3.setEnabled(false);
            btn_força_3.setBackgroundColor(Color.parseColor("#C95808"));
        }
        btn_força_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador8++;
                Intent ir = new Intent(getBaseContext(), velocidade_3.class);
                ir.putExtra("pao","FORÇA");
                startActivity(ir);
            }
        });

        btn_inteligencia_3 = (Button) findViewById(R.id.btn_inteligencia_3);
        if(Score.contador9==3){
            btn_inteligencia_3.setEnabled(false);
            btn_inteligencia_3.setBackgroundColor(Color.parseColor("#C95808"));
        }
        btn_inteligencia_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador9++;
                Intent ir = new Intent(getBaseContext(), velocidade_3.class);
                ir.putExtra("pao","INTELIGÊNCIA");
                startActivity(ir);
            }
        });
    }
}
