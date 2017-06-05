package com.example.anderson.super_trunfo_digimon;

import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anderson on 04/06/2017.
 */

public class Game {
    private List<ImageButton>
            imageButtons = new ArrayList<>();
    private int[] serie = new int[2];

    public Game(ImageButton...imageButtons){
        for (ImageButton btn : imageButtons)
            this.imageButtons.add(btn);
        this.serie[0] = 0;
        this.serie[1] = 0;
    }
    public Game addSerie(int jogador){
        Game g = (++serie[jogador] < 3) ? null : this;
        return g;
    }
    public List<ImageButton> getImageButtons(){

        return this.imageButtons;
    }
}
