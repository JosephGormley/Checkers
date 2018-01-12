package com.example.joegormley.checkers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

enum Turn { RED, BLACK}

public class MainActivity extends AppCompatActivity {

    static Piece[][] checkersBoard; // Representation of state of the game.
    Turn turn; // Indicate player's turn.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*********************
     * BUTTONS - ONCLICK *
     *********************/

    public void startGame(View view){
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);

        // Initialize back-end representation of board.
        init();
    }

    public void openSettings(View view){
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }


    /*****************
     * HELPER METHODS *
     *****************/

    /* Initializes back-end representation of game */
    public void init(){

        checkersBoard = new Piece[8][8];
        turn = Turn.RED;

        // @TODO
        // Place red pieces.
        Piece


    }
}
