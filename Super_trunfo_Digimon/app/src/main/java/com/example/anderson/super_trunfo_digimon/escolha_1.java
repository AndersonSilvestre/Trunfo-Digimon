package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Anderson on 28/05/2017.
 */

public class escolha_1 extends AppCompatActivity {

    private Button btn_força_1;
    private Button btn_inteligencia_1;
    private Button btn_velocidade_1;
    private int contador = 0;
    private int contador2 = 0;
    private int contador3 = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escolha_1);

        btn_velocidade_1 = (Button) findViewById(R.id.btn_velocidade_1);
        if(Score.contador1==3){
            btn_velocidade_1.setEnabled(false);
            btn_velocidade_1.setBackgroundColor(Color.parseColor("#DA9C00"));
        }
        btn_velocidade_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador1++;
                Intent ir = new Intent(getBaseContext(), velocidade_1.class);
                ir.putExtra("pao","VELOCIDADE");
                startActivity(ir);
            }
        });

        btn_força_1 = (Button) findViewById(R.id.btn_forca_1);
        if(Score.contador2==3){
            btn_força_1.setEnabled(false);
            btn_força_1.setBackgroundColor(Color.parseColor("#DA9C00"));
        }
        btn_força_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador2++;
                Intent ir = new Intent(getBaseContext(), velocidade_1.class);
                ir.putExtra("pao","FORÇA");
                startActivity(ir);
            }
        });

        btn_inteligencia_1 = (Button) findViewById(R.id.btn_inteligencia_1);
        if(Score.contador3==3){
            btn_inteligencia_1.setEnabled(false);
            btn_inteligencia_1.setBackgroundColor(Color.parseColor("#DA9C00"));
        }
        btn_inteligencia_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Score.contador3++;
                Intent ir = new Intent(getBaseContext(), velocidade_1.class);
                ir.putExtra("pao","INTELIGÊNCIA");
                startActivity(ir);
            }
        });


    }

}
