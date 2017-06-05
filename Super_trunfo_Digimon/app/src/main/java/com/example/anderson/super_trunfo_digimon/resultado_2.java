package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anderson on 29/05/2017.
 */

public class resultado_2 extends AppCompatActivity {

    private TextView tv_valor;
    private ImageView iv_computador;
    private TextView tv_velocidade_computador;
    private static int TEMPO = 3000;
    private  TextView Vel_gabumon;
    private TextView Vel_inimigo_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_2);
        tv_valor = (TextView) findViewById(R.id.tv_valor);
        iv_computador = (ImageView) findViewById(R.id.iv_computador);
        tv_velocidade_computador = (TextView) findViewById(R.id.tv_velocidade_computador);
        Vel_gabumon = (TextView) findViewById(R.id.Vel_gabumon);
        Vel_inimigo_1 = (TextView) findViewById(R.id.Vel_inimigo_2);
        //
        Intent i = getIntent();
        Bundle valor = i.getExtras();

        String getValor = (String) valor.get("valor");
        String pao = (String) valor.get("pao1");
        int valorJogador = Integer.valueOf(getValor);

        tv_valor.setText(getValor);
        Vel_gabumon.setText(pao);
        Vel_inimigo_1.setText(pao);

        int escolhaComputador = (int) (Math.random()*100)+1;
        int personagemComputador = (int) (Math.random()*3)+1;

        if(personagemComputador == 1){
            iv_computador.setImageResource(R.drawable.piedmon);
        }else if(personagemComputador == 2){
            iv_computador.setImageResource(R.drawable.tailmon);
        }else if(personagemComputador == 3) {
            iv_computador.setImageResource(R.drawable.puppetmon);
        }

        tv_velocidade_computador.setText(Integer.toString(escolhaComputador));

        if(escolhaComputador == valorJogador){
            Toast.makeText(getBaseContext(),
                    "EMPATE",Toast.LENGTH_LONG).show();
        }else if(escolhaComputador < valorJogador){
            Toast.makeText(getBaseContext(),
                    "JOGADOR GANHOU",Toast.LENGTH_LONG).show();
            Score.score += 10;
        }else{
            Toast.makeText(getBaseContext(),
                    "JOGADOR PERDEU",Toast.LENGTH_LONG).show();
            Score.score -= 15;
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i;
                if(Score.score<0){
                    Intent perdeu = new Intent();
                    perdeu.setClass(getBaseContext(),perdeu.class);
                    startActivity(perdeu);
                    Score.score=0;
                    finish();
                }else if (Score.score>50){
                    Intent velha = new Intent();
                    velha.setClass(getBaseContext(), venceu.class);
                    startActivity(velha);
                    finish();

                }else{
                    i = new Intent(getBaseContext(), menu_principal.class);
                    startActivity(i);
                    finish();
                }
            }
        },TEMPO);

    }
}
