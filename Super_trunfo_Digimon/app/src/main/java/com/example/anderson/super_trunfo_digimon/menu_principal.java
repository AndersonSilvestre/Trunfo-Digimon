package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anderson on 28/05/2017.
 */

public class menu_principal extends AppCompatActivity{
    private Button btn_selecionar_1;
    private Button btn_selecionar_2;
    private Button btn_selecionar_3;


    private TextView tv_score;
    //int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        btn_selecionar_1 = (Button) findViewById(R.id.btn_selecionar_1);
        btn_selecionar_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "Agumon",Toast.LENGTH_SHORT).show();
                Intent i = new Intent();
                i.setClass(getBaseContext(), escolha_1.class);
                startActivity(i);
            }
        });

        btn_selecionar_2 = (Button) findViewById(R.id.btn_selecionar_2);
        btn_selecionar_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "Gabumon",Toast.LENGTH_SHORT).show();
                Intent selecionar2 = new Intent(getBaseContext(), escolha_2.class);
                startActivity(selecionar2);
            }
        });

        btn_selecionar_3 = (Button) findViewById(R.id.btn_selecionar_3);
        btn_selecionar_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        "Lopmon",Toast.LENGTH_SHORT).show();
                Intent pao = new Intent(getBaseContext(), escolha_3.class);
                startActivity(pao);
            }
        });

        tv_score = (TextView) findViewById(R.id.tv_score);
        tv_score.setText(Integer.toString(Score.score));


    }
}
