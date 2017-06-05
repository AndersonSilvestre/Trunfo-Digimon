package com.example.anderson.super_trunfo_digimon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

/**
 * Created by Anderson on 30/05/2017.
 */

public class velocidade_3 extends AppCompatActivity {

    private SeekBar sk_velocidade;
    private Button btn_jogar;
    private String paosalvo;
    int valor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.velocidade_3);
        btn_jogar = (Button) findViewById(R.id.btn_jogar);
        sk_velocidade = (SeekBar) findViewById(R.id.sk_velocidade);

        sk_velocidade.setMax(100);
        sk_velocidade.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valor = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valorTexto = Integer.toString(valor);
                Intent i = new Intent(getBaseContext(), resultado_3.class);
                paosalvo = getIntent().getStringExtra("pao");
                i.putExtra("pao1",paosalvo);
                i.putExtra("valor", valorTexto);
                startActivity(i);
            }
        });
    }
}
