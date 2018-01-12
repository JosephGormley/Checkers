package com.example.joegormley.checkers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        printBoard();
    }

    /*****************
     * HELPER METHODS *
     *****************/

    void printBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(MainActivity.checkersBoard[i][j]);
            }
            System.out.println();
        }
    }

}
